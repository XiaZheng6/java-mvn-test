package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TRight;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: 权限
 * @author: jie.pang
 * @create: 2018-07-31 18:31
 **/
public interface RightService {
    Page<TRight> listRightForSaaS(PageForm form);
    Page<TRight> listRightForPOS(PageForm form);
}
