package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.pos.basic.dao.TAreaMapper;
import cn.teamar.genki.pos.basic.dao.ext.TAreaMapperExt;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.po.TAreaExample;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.vo.area.AreaForm;
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
 * @create: 2018-08-01 14:48
 **/
@Slf4j
@Service
public class AreaServiceImp implements AreaService {

    @Autowired
    private TAreaMapper areaMapper;
    @Autowired
    private TAreaMapperExt areaMapperExt;
    @Override
    public Page<TArea> listArea(PageForm form) {
        TAreaExample ex = new TAreaExample();
        ex.createCriteria()
                .andSIdEqualTo(form.getSid())
                .andStateNotEqualTo((byte)DataStateEnum.DATA_STATE_DELETE.getCode())
        ;
        Page<TArea> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        areaMapper.selectByExample(ex);
        return result;
    }

    @Override
    public List<TArea> getAreaList(BaseForm form) {
        TAreaExample ex = new TAreaExample();
        ex.createCriteria()
                .andSIdEqualTo(form.getSid())
                .andStateEqualTo((byte)DataStateEnum.DATA_STATE_ENABLE.getCode())
        ;
        return areaMapper.selectByExample(ex);
    }


}
