package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TDuty;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: 职能
 * @author: jie.pang
 * @create: 2018-07-31 18:31
 **/
public interface DutyService {
    Page<TDuty> listDuty(PageForm form);
}
