package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.po.TAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TAreaMapper {
    int countByExample(TAreaExample example);

    int deleteByExample(TAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TArea record);

    int insertSelective(TArea record);

    List<TArea> selectByExample(TAreaExample example);

    TArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}