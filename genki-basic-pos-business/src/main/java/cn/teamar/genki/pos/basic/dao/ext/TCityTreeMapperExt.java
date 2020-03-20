package cn.teamar.genki.pos.basic.dao.ext;

import cn.teamar.genki.pos.basic.po.TCityTree;
import cn.teamar.genki.pos.basic.po.TCityTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCityTreeMapperExt {
    int countByExample(TCityTreeExample example);

    int deleteByExample(TCityTreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCityTree record);

    int insertSelective(TCityTree record);

    List<TCityTree> selectByExample(TCityTreeExample example);

    TCityTree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCityTree record, @Param("example") TCityTreeExample example);

    int updateByExample(@Param("record") TCityTree record, @Param("example") TCityTreeExample example);

    int updateByPrimaryKeySelective(TCityTree record);

    int updateByPrimaryKey(TCityTree record);

	List<TCityTree> selectByType(byte type);

	List<TCityTree> selectAllByType(byte type);
}