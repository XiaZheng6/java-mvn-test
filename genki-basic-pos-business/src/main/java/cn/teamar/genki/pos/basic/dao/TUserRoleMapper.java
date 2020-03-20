package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TUserRole;
import cn.teamar.genki.pos.basic.po.TUserRoleExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TUserRole;
import cn.teamar.genki.pos.basic.po.TUserRoleExample;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    int countByExample(TUserRoleExample example);

    int deleteByExample(TUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

    List<TUserRole> selectByExample(TUserRoleExample example);

    TUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    int updateByExample(@Param("record") TUserRole record, @Param("example") TUserRoleExample example);

    int updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);
}