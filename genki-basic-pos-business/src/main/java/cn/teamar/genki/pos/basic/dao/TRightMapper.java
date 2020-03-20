package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TRight;
import cn.teamar.genki.pos.basic.po.TRightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRightMapper {
    int countByExample(TRightExample example);

    int deleteByExample(TRightExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRight record);

    int insertSelective(TRight record);

    List<TRight> selectByExample(TRightExample example);

    TRight selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRight record, @Param("example") TRightExample example);

    int updateByExample(@Param("record") TRight record, @Param("example") TRightExample example);

    int updateByPrimaryKeySelective(TRight record);

    int updateByPrimaryKey(TRight record);
}