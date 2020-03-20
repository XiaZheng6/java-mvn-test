package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.common.tools.vo.NameCodeVO;
import cn.teamar.genki.pos.basic.po.TRole;
import cn.teamar.genki.pos.basic.vo.pos.PosUserRightVO;
import cn.teamar.genki.pos.basic.vo.power.RoleVO;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 权限相关
 * @author: jie.pang
 * @create: 2018-07-30 17:17
 **/
public interface PowerBusiness {
    Page<TRole> listRole(PageForm form);
    List<NameCodeVO> listPOSRight(PageForm form);
    List<NameCodeVO> listSaaSRight(PageForm form);
    List<NameCodeVO> listDuty(PageForm form);
    RoleVO getRole(Long roleId);
    List<PosUserRightVO> selectRightFromUserIds(List<Long> userIds);
}
