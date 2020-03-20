package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodExSpecRef;
import cn.teamar.genki.pos.basic.po.FoodExSpecRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodExSpecRefMapper {
    int countByExample(FoodExSpecRefExample example);

    int deleteByExample(FoodExSpecRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodExSpecRef record);

    int insertSelective(FoodExSpecRef record);

    List<FoodExSpecRef> selectByExample(FoodExSpecRefExample example);

    FoodExSpecRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodExSpecRef record, @Param("example") FoodExSpecRefExample example);

    int updateByExample(@Param("record") FoodExSpecRef record, @Param("example") FoodExSpecRefExample example);

    int updateByPrimaryKeySelective(FoodExSpecRef record);

    int updateByPrimaryKey(FoodExSpecRef record);
}