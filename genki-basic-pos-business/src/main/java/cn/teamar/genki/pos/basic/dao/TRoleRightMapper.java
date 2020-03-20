package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TRoleRight;
import cn.teamar.genki.pos.basic.po.TRoleRightExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TRoleRight;
import cn.teamar.genki.pos.basic.po.TRoleRightExample;
import org.apache.ibatis.annotations.Param;

public interface TRoleRightMapper {
    int countByExample(TRoleRightExample example);

    int deleteByExample(TRoleRightExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRoleRight record);

    int insertSelective(TRoleRight record);

    List<TRoleRight> selectByExample(TRoleRightExample example);

    TRoleRight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRoleRight record, @Param("example") TRoleRightExample example);

    int updateByExample(@Param("record") TRoleRight record, @Param("example") TRoleRightExample example);

    int updateByPrimaryKeySelective(TRoleRight record);

    int updateByPrimaryKey(TRoleRight record);
}