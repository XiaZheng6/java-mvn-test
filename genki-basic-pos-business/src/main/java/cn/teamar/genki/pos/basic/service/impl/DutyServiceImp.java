package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.dao.TDutyMapper;
import cn.teamar.genki.pos.basic.po.TDuty;
import cn.teamar.genki.pos.basic.po.TDutyExample;
import cn.teamar.genki.pos.basic.service.DutyService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-07-31 18:32
 **/
@Slf4j
@Service
public class DutyServiceImp implements DutyService {

    @Autowired
    TDutyMapper dutyMapper;

    /**
     * 分页查询
     * @param form
     * @return
     */
    @Override
    public Page<TDuty> listDuty(PageForm form) {
        TDutyExample ex = new TDutyExample();
        ex.createCriteria();
        Page<TDuty> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        dutyMapper.selectByExample(ex);
        return result;
    }

}
