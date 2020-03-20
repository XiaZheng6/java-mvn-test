package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.vo.pos.PosUserRightVO;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 权限管理
 * @author: jie.pang
 * @create: 2018-07-31 11:51
 **/
public interface RoleService {

    /**
     * 获取角色列表
     * @param form
     * @return
     */
    Page<TRole> listRole(PageForm form);


    /**
     * 根据用户ID返回所有角色
     * @return
     */
    List<TUserRole> selectRoleWithUserID(Long userId);

    /**
     * 根据角色ID返回所有权限
     * @param roleId
     * @return
     */
    List<TRoleRight> selectRight(Long roleId);
    /**
     * 根据角色ID返回所有职能
     * @param roleId
     * @return
     */
    List<TRoleDyty> selectDuty(Long roleId);

    /**
     * 通过UserId 返回所有权限
     * @param userId
     * @return
     */
    List<TRight> selectPosRightWithUserId(Long userId);


    /**
     * 通过ID获取Role
     * @param roleId
     * @return
     */
    TRole getRole(Long roleId);

    /**
     * 通过RoleID获取角色下用户数量
     * @param roleId
     * @return
     */
    int selectUserCountWithRoleId(Long roleId);

    /**
     * 通用userids获取权限VO
     * @param userIds
     * @return
     */
    List<PosUserRightVO> selectRightFromUserIds(List<Long> userIds);


}
