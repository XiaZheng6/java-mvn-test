package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeForm;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 时段管理
 * @author: jie.pang
 * @create: 2018-07-31 11:51
 **/
public interface SlotTimeService {
    /**
     * 列表
     * @param form
     * @return
     */
    Page<TSlottime> listSlotTime(PageForm form);

    List<TSlottime> getSlotTimeList(BaseForm form);
}
