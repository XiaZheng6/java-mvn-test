package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.vo.pos.PosLoginForm;
import cn.teamar.genki.pos.basic.vo.pos.PosLoginVO;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: UserBusiness
 * @author: jie.pang
 * @create: 2018-07-30 17:17
 **/
public interface UserBusiness {

    PosLoginVO posLogin(PosLoginForm form);
    Page<TUser> listUsers(PageForm form);
}
