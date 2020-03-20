package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.utils.Assert;
import cn.teamar.genki.common.tools.exception.BusinessException;
import cn.teamar.genki.pos.basic.business.UserBusiness;
import cn.teamar.genki.pos.basic.errors.Errors;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.service.RoleService;
import cn.teamar.genki.pos.basic.service.UserService;
import cn.teamar.genki.pos.basic.utils.Password;
import cn.teamar.genki.pos.basic.vo.pos.PosLoginForm;
import cn.teamar.genki.pos.basic.vo.pos.PosLoginVO;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description: UserBusiness
 * @author: jie.pang
 * @create: 2018-07-30 15:43
 **/
@Slf4j
@Service
public class UserBusinessImp implements UserBusiness {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    public PosLoginVO posLogin(PosLoginForm loginForm) {
        PosLoginVO vo = null;
        TUser user = null;
        log.info("POS login : {}", loginForm);
        user = userService.getByUserName(loginForm.getUserName());
        Assert.notNull(user, Errors.USER_NOT_EXISTS);
        if (!loginForm.getPassword().equals(user.getPassword())) {
            throw new BusinessException(Errors.INCORRECT_PASSWORD);
        }
        vo = new PosLoginVO();
        vo.setGid(user.getgId());
        vo.setBid(user.getbId());
        vo.setSid(user.getsId());
        vo.setUserId(user.getId());
        vo.setRealName(user.getRealName());
        vo.setUserName(user.getUserName());
        vo.setUserType(user.getUserType());
        vo.setIsPrimary(user.getIsPrimary());
        return vo;
    }

    @Override
    public Page<TUser> listUsers(PageForm form) {
        Page<TUser> userList = userService.selectBySid(form.getSid(),form.getOffset(),form.getSize());
        return userList;
    }


}
