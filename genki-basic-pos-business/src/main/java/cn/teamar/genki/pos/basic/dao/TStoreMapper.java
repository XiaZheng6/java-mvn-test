package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TStore;
import cn.teamar.genki.pos.basic.po.TStoreExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TStore;
import cn.teamar.genki.pos.basic.po.TStoreExample;
import org.apache.ibatis.annotations.Param;

public interface TStoreMapper {
    int countByExample(TStoreExample example);

    int deleteByExample(TStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TStore record);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStoreExample example);

    TStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByExample(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);
}