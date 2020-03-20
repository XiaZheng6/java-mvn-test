package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.pos.basic.dao.TRemarkMapper;
import cn.teamar.genki.pos.basic.dao.TTableMapper;
import cn.teamar.genki.pos.basic.dao.ext.TTableMapperExt;
import cn.teamar.genki.pos.basic.po.TRemark;
import cn.teamar.genki.pos.basic.po.TRemarkExample;
import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.po.TTableExample;
import cn.teamar.genki.pos.basic.service.TableService;
import cn.teamar.genki.pos.basic.vo.table.TableForm;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-01 16:34
 **/
@Slf4j
@Service
public class TableServiceImp implements TableService {
    @Autowired
    private TTableMapper tableMapper;
    @Autowired
    private TTableMapperExt tTableMapperExt;
    @Autowired
    private TRemarkMapper remarkMapper;


    @Override
    public Page<TTable> listTable(PageForm form) {
        TTableExample ex = new TTableExample();
        TTableExample.Criteria criteria = ex.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateNotEqualTo(DataStateEnum.DATA_STATE_DELETE.getCodeAsByte());
        Page<TTable> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        tableMapper.selectByExample(ex);
        return result;
    }

    @Override
    public List<TTable> tableList(BaseForm form) {
        TTableExample ex = new TTableExample();
        TTableExample.Criteria criteria = ex.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo(DataStateEnum.DATA_STATE_ENABLE.getCodeAsByte());
        return tableMapper.selectByExample(ex);
    }

    /**
     * @Description: 查询原因列表
     * @method remarkList
     * @param  
     * @return  
     * @throws
     * @author HuaZi
     * @date 2018/10/17 16:32 
    */
    @Override
    public List<TRemark> remarkList(BaseForm form) {
        TRemarkExample ex = new TRemarkExample();
        TRemarkExample.Criteria criteria = ex.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo(DataStateEnum.DATA_STATE_ENABLE.getCodeAsByte());
        return remarkMapper.selectByExample(ex);
    }

}
