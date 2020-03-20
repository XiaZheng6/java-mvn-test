package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.common.tools.vo.NameCodeVO;
import cn.teamar.genki.pos.basic.business.PowerBusiness;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.DutyService;
import cn.teamar.genki.pos.basic.service.RightService;
import cn.teamar.genki.pos.basic.service.RoleService;
import cn.teamar.genki.pos.basic.vo.pos.PosUserRightVO;
import cn.teamar.genki.pos.basic.vo.power.RoleVO;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-07-31 18:29
 **/
@Slf4j
@Service
public class PowerBusinessImp implements PowerBusiness {

    @Autowired
    private DutyService dutyService;
    @Autowired
    private RightService rightService;
    @Autowired
    private RoleService roleService;

    /**
     * 分页列表角色
     * @param form
     * @return
     */
    @Override
    public Page<TRole> listRole(PageForm form) {
        return roleService.listRole(form);
    }

    /**
     * 分页列表权限-pos
     * @param form
     * @return
     */
    @Override
    public List<NameCodeVO> listPOSRight(PageForm form) {
        return convertRight(rightService.listRightForPOS(form));
    }

    /**
     * 分页列表权限-saas
     * @param form
     * @return
     */
    @Override
    public List<NameCodeVO> listSaaSRight(PageForm form) {
        return convertRight(rightService.listRightForSaaS(form));
    }

    /**
     * 分页列表职能
     * @param form
     * @return
     */
    @Override
    public List<NameCodeVO> listDuty(PageForm form) {
        return convertDuty(dutyService.listDuty(form));
    }




    @Override
    public RoleVO getRole(Long roleId) {
        RoleVO vo = null;
        TRole role = roleService.getRole(roleId);
        if(role!=null){
            vo = new RoleVO();
            vo.setId(roleId);
            vo.setRoleName(role.getRoleName());
            //权限 职能
            Map<Long,Long> rights = roleService.selectRight(roleId).stream().collect(Collectors.toMap(TRoleRight::getRightId,TRoleRight::getRightId));
            Map<Long,Long> dutys = roleService.selectDuty(roleId).stream().collect(Collectors.toMap(TRoleDyty::getDutyId,TRoleDyty::getDutyId));
            vo.setDutys(new ArrayList<Long>(dutys.keySet()));
            vo.setRights(new ArrayList<Long>(rights.keySet()));
        }
        return vo;
    }

    @Override
    public List<PosUserRightVO> selectRightFromUserIds(List<Long> userIds) {
        if(userIds.size()<1){
            return null;
        }
        return roleService.selectRightFromUserIds(userIds);
    }



    /**
     * VO转换
     * @param list
     * @return
     */
    private List<NameCodeVO> convertRight(List<TRight> list) {
        return Optional.ofNullable(list)
                .orElseGet(ArrayList::new).stream()
                .map(right -> new NameCodeVO(right.getId().intValue(),right.getRightName()))
                .collect(Collectors.toList());
    }
    /**
     * VO转换
     * @param list
     * @return
     */
    private List<NameCodeVO> convertDuty(List<TDuty> list) {
        return Optional.ofNullable(list)
                .orElseGet(ArrayList::new).stream()
                .map(duty -> new NameCodeVO(duty.getId().intValue(),duty.getDutyName()))
                .collect(Collectors.toList());
    }

    /**
     * 封装角色权限关系
     * @param roleId
     * @param rights
     * @param roleRights
     */
    private void genRoleRight(Long roleId, List<Long> rights, List<TRoleRight> roleRights) {
        if(rights!=null && rights.size()>0){
            for(Long rightId : rights){
                TRoleRight roleRight = new TRoleRight();
                roleRight.setRoleId(roleId);
                roleRight.setRightId(rightId);
                roleRights.add(roleRight);
            }
        }
    }

    /**
     * 封装角色职能关系
     *
     * @param roleId
     * @param dutys
     * @param roleDutys
     */
    private void genRoleDuty(Long roleId, List<Long> dutys, List<TRoleDyty> roleDutys) {
        if(dutys!=null && dutys.size()>0){
            for(Long dutyId : dutys){
                TRoleDyty roleDyty = new TRoleDyty();
                roleDyty.setRoleId(roleId);
                roleDyty.setDutyId(dutyId);
                roleDutys.add(roleDyty);
            }
        }
    }
}
