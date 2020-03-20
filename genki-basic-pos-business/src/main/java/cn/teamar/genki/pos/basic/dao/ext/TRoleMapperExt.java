package cn.teamar.genki.pos.basic.dao.ext;

import cn.teamar.genki.pos.basic.vo.pos.PosUserRightVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 角色Mapper扩展
 * @author: jie.pang
 * @create: 2018-07-30 16:15
 **/
public interface TRoleMapperExt {

    List<PosUserRightVO> selectRightFromUserIds(@Param("ids")List<Long> ids);
}
