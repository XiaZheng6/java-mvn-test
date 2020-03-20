package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.basic.common.utils.Assert;
import cn.teamar.genki.pos.basic.business.AreaBusiness;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.vo.area.AreaForm;
import cn.teamar.genki.pos.basic.vo.area.AreaVO;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-01 14:56
 **/
@Slf4j
@Service
public class AreaBusinessImp implements AreaBusiness {
    @Autowired
    private AreaService areaService;


    @Override
    public Page<TArea> list(PageForm form) {
        return areaService.listArea(form);
    }
}
