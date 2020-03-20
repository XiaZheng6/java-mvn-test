package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TRoleDyty;
import cn.teamar.genki.pos.basic.po.TRoleDytyExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TRoleDyty;
import cn.teamar.genki.pos.basic.po.TRoleDytyExample;
import org.apache.ibatis.annotations.Param;

public interface TRoleDytyMapper {
    int countByExample(TRoleDytyExample example);

    int deleteByExample(TRoleDytyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRoleDyty record);

    int insertSelective(TRoleDyty record);

    List<TRoleDyty> selectByExample(TRoleDytyExample example);

    TRoleDyty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRoleDyty record, @Param("example") TRoleDytyExample example);

    int updateByExample(@Param("record") TRoleDyty record, @Param("example") TRoleDytyExample example);

    int updateByPrimaryKeySelective(TRoleDyty record);

    int updateByPrimaryKey(TRoleDyty record);
}