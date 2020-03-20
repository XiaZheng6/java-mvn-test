package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.basic.common.utils.Assert;
import cn.teamar.genki.pos.basic.business.SlotTimeBusiness;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.service.SlotTimeService;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeForm;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeVO;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 16:18
 **/
@Slf4j
@Service
public class SlotTimeBusinessImp implements SlotTimeBusiness {

    @Autowired
    private SlotTimeService slotTimeService;

    @Override
    public Page<TSlottime> list(PageForm form) {
        return slotTimeService.listSlotTime(form);
    }

}
