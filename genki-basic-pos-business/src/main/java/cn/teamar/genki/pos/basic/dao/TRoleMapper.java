package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TRole;
import cn.teamar.genki.pos.basic.po.TRoleExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TRole;
import cn.teamar.genki.pos.basic.po.TRoleExample;
import org.apache.ibatis.annotations.Param;

public interface TRoleMapper {
    int countByExample(TRoleExample example);

    int deleteByExample(TRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRole record);

    int insertSelective(TRole record);

    List<TRole> selectByExample(TRoleExample example);

    TRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}