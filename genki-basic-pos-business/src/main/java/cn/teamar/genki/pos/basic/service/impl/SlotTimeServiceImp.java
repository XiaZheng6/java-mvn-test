package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.dao.TSlottimeMapper;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.po.TSlottimeExample;
import cn.teamar.genki.pos.basic.service.SlotTimeService;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeForm;
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
 * @create: 2018-08-02 16:10
 **/
@Slf4j
@Service
public class SlotTimeServiceImp implements SlotTimeService {

    @Autowired
    private TSlottimeMapper slottimeMapper;

    @Override
    public Page<TSlottime> listSlotTime(PageForm form) {
        TSlottimeExample ex = new TSlottimeExample();
        ex.createCriteria()
                .andSIdEqualTo(form.getSid())
        ;
        Page<TSlottime> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        slottimeMapper.selectByExample(ex);
        return result;
    }

    @Override
    public List<TSlottime> getSlotTimeList(BaseForm form) {
        TSlottimeExample ex = new TSlottimeExample();
        ex.createCriteria().andSIdEqualTo(form.getSid());
        return slottimeMapper.selectByExample(ex);
    }

}
