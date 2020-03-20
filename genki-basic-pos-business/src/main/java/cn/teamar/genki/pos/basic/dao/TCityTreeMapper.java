package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TCityTree;
import cn.teamar.genki.pos.basic.po.TCityTreeExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TCityTree;
import cn.teamar.genki.pos.basic.po.TCityTreeExample;
import org.apache.ibatis.annotations.Param;

public interface TCityTreeMapper {
    int countByExample(TCityTreeExample example);

    int deleteByExample(TCityTreeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TCityTree record);

    int insertSelective(TCityTree record);

    List<TCityTree> selectByExample(TCityTreeExample example);

    TCityTree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TCityTree record, @Param("example") TCityTreeExample example);

    int updateByExample(@Param("record") TCityTree record, @Param("example") TCityTreeExample example);

    int updateByPrimaryKeySelective(TCityTree record);

    int updateByPrimaryKey(TCityTree record);
}