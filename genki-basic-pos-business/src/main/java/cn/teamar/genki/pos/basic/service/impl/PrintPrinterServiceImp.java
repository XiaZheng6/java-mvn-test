package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.pos.basic.dao.*;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.PrintPrinterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class PrintPrinterServiceImp implements PrintPrinterService {

    @Autowired
    private TPrintPrinterMapper printPrinterMapper;
    @Autowired
    private TPrinterSchemeLinkMapper printerSchemeLinkMapper;
    @Autowired
    private TPrinterTemplateLinkMapper printerTemplateLinkMapper;
    @Autowired
    private FoodCommodityMapper foodCommodityMapper;
    @Autowired
    private TPrintTemplateBaseMapper printTemplateBaseMapper;
    @Autowired
    private TPrintTemplateContentMapper printTemplateContentMapper;

    /**
     * @Description: 打印机集合（模板集合，基础商品ID）
     * @method list
     * @param  
     * @return  
     * @throws
     * @author HuaZi
     * @date 2018/9/29 20:51 
    */
    @Override
    public List<TPrintPrinter> list(BaseForm form){
        TPrintPrinterExample example = new TPrintPrinterExample();
        TPrintPrinterExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) DataStateEnum.DATA_STATE_ENABLE.getCode());
        List<TPrintPrinter> printPrinterList = printPrinterMapper.selectByExample(example);
        if(printPrinterList!=null&&!printPrinterList.isEmpty()){
            for(TPrintPrinter printPrinter : printPrinterList){
                //根据打印机ID查找模块集合
                TPrinterTemplateLinkExample ex1 = new TPrinterTemplateLinkExample();
                TPrinterTemplateLinkExample.Criteria cc1 = ex1.createCriteria();
                cc1.andPrinterIdEqualTo(printPrinter.getId());
                List<TPrinterTemplateLink> templateLinkList = printerTemplateLinkMapper.selectByExample(ex1);
                printPrinter.settPrinterTemplateLinkList(templateLinkList);

                /**
                 * 1:根据模板ID到t_print_template_base表中查询得出对应的t_print_template_content模板内容数据
                 */
                if (templateLinkList != null && !templateLinkList.isEmpty()) {
                    for (TPrinterTemplateLink link : templateLinkList) {
                        TPrintTemplateBase base = printTemplateBaseMapper.selectByPrimaryKey(link.getTemplateId());
                        if (base!=null) {
                            TPrintTemplateContent content = printTemplateContentMapper.selectByPrimaryKey(base.getTemplateContentId());
                            if (content!=null) {
                                link.setPrintTemplateContent(content);
                            }
                        }
                    }
                }

                //根据打印机ID查找商品集合
                List<String> schemeLinkList = printerSchemeLinkMapper.selectSchemeListNameByPrinterId(printPrinter.getId());
                if(schemeLinkList!=null&&!schemeLinkList.isEmpty()){
                    List<Long> commodityList = foodCommodityMapper.selectListCommodityIdByPrinterId(schemeLinkList);
                    if(commodityList!=null&&!commodityList.isEmpty()){
                        printPrinter.setFoodCommodityList(commodityList);
                    }
                }
            }
        }
        return printPrinterList;
    }

}
