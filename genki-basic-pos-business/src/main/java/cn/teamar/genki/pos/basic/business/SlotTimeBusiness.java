package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeForm;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeVO;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: 时段相关
 * @author: jie.pang
 * @create: 2018-07-30 17:17
 **/
public interface SlotTimeBusiness {

    Page<TSlottime> list(PageForm form);
}
