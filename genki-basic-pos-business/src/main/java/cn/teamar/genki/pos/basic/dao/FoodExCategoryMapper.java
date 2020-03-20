package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodExCategory;
import cn.teamar.genki.pos.basic.po.FoodExCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodExCategoryMapper {
    int countByExample(FoodExCategoryExample example);

    int deleteByExample(FoodExCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodExCategory record);

    int insertSelective(FoodExCategory record);

    List<FoodExCategory> selectByExample(FoodExCategoryExample example);

    FoodExCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodExCategory record, @Param("example") FoodExCategoryExample example);

    int updateByExample(@Param("record") FoodExCategory record, @Param("example") FoodExCategoryExample example);

    int updateByPrimaryKeySelective(FoodExCategory record);

    int updateByPrimaryKey(FoodExCategory record);
}