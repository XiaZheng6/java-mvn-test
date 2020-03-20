package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.po.TTableExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.po.TTableExample;
import org.apache.ibatis.annotations.Param;

public interface TTableMapper {
    int countByExample(TTableExample example);

    int deleteByExample(TTableExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTable record);

    int insertSelective(TTable record);

    List<TTable> selectByExample(TTableExample example);

    List<TTable> selectAreaNameByExample(TTableExample example);

    TTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTable record, @Param("example") TTableExample example);

    int updateByExample(@Param("record") TTable record, @Param("example") TTableExample example);

    int updateByPrimaryKeySelective(TTable record);

    int updateByPrimaryKey(TTable record);
}