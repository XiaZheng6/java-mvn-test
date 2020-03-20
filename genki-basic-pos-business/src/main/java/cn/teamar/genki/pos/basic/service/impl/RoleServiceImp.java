package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.basic.common.enums.PowerEnum;
import cn.teamar.genki.basic.common.utils.Assert;
import cn.teamar.genki.pos.basic.dao.*;
import cn.teamar.genki.pos.basic.dao.ext.TRoleMapperExt;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.RoleService;
import cn.teamar.genki.pos.basic.vo.pos.PosUserRightVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-07-31 18:34
 **/
@Slf4j
@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    TRoleMapper roleMapper;
    @Autowired
    TRoleDytyMapper roleDytyMapper;
    @Autowired
    TRoleRightMapper roleRightMapper;
    @Autowired
    TUserRoleMapper userRoleMapper;
    @Autowired
    TRoleMapperExt roleMapperExt;
    @Autowired
    TRightMapper rightMapper;

    /**
     * 分页查询
     * @param form
     * @return
     */
    @Override
    public Page<TRole> listRole(PageForm form) {
        TRoleExample ex = new TRoleExample();
        ex.createCriteria().andSIdEqualTo(form.getSid()).andStateNotEqualTo((byte)DataStateEnum.DATA_STATE_DELETE.getCode());
        Page<TRole> result = PageHelper.offsetPage(form.getOffset(), form.getSize());
        roleMapper.selectByExample(ex);
        return result;
    }


    @Override
    public List<TUserRole> selectRoleWithUserID(Long userId) {
        TUserRoleExample ex = new TUserRoleExample();
        ex.createCriteria().andUserIdEqualTo(userId);
        return userRoleMapper.selectByExample(ex);
    }

    @Override
    public List<TRoleRight> selectRight(Long roleId) {
        TRoleRightExample ex = new TRoleRightExample();
        ex.createCriteria().andRoleIdEqualTo(roleId);
        return roleRightMapper.selectByExample(ex);
    }

    @Override
    public List<TRoleDyty> selectDuty(Long roleId) {
        TRoleDytyExample ex = new TRoleDytyExample();
        ex.createCriteria().andRoleIdEqualTo(roleId);
        return roleDytyMapper.selectByExample(ex);
    }


    //TODO  低效方法，优化重构！！！！！
    @Override
    public List<TRight> selectPosRightWithUserId(Long userId) {


        List<TUserRole> list = selectRoleWithUserID(userId);
        List<Long> roleIds = new ArrayList<Long>();
        for(TUserRole userRole:list){
            roleIds.add(userRole.getRoleId());
        }
        Assert.state(roleIds.size()>0, ErrorsEnum.USER_ROLE_EXISTS);
        TRoleRightExample ex = new TRoleRightExample();
        ex.createCriteria().andRoleIdIn(roleIds);
        List<TRoleRight> roleRights = roleRightMapper.selectByExample(ex);
        List<Long> rightsId = new ArrayList<Long>();
        for(TRoleRight roleRight:roleRights){
            rightsId.add(roleRight.getRightId());
        }
        TRightExample rightExample = new TRightExample();
        rightExample.createCriteria().andIdIn(rightsId).andRightTypeBetween(PowerEnum.RIGHT_TYPE_POS_ACTION.getCodeAsByte(),PowerEnum.RIGHT_TYPE_POS_MENU.getCodeAsByte());
        List<TRight> rights = rightMapper.selectByExample(rightExample);
        return removeDuplicate(rights);
    }



    @Override
    public TRole getRole(Long roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }



    @Override
    public int selectUserCountWithRoleId(Long roleId) {
        TUserRoleExample ex = new TUserRoleExample();
        ex.createCriteria().andRoleIdEqualTo(roleId);
        return userRoleMapper.countByExample(ex);
    }

    @Override
    public List<PosUserRightVO> selectRightFromUserIds(List<Long> userIds) {
        return roleMapperExt.selectRightFromUserIds(userIds);
    }


    /**
     * 去重
     * @param list
     * @return
     */
    public static List<TRight> removeDuplicate(List<TRight> list) {
        if(list==null)
            return null;
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        return list;
    }


}

