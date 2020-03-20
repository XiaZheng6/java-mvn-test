package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodExTagTxtCommodity;
import cn.teamar.genki.pos.basic.po.FoodExTagTxtCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodExTagTxtCommodityMapper {
    int countByExample(FoodExTagTxtCommodityExample example);

    int deleteByExample(FoodExTagTxtCommodityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodExTagTxtCommodity record);

    int insertSelective(FoodExTagTxtCommodity record);

    List<FoodExTagTxtCommodity> selectByExample(FoodExTagTxtCommodityExample example);

    FoodExTagTxtCommodity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodExTagTxtCommodity record, @Param("example") FoodExTagTxtCommodityExample example);

    int updateByExample(@Param("record") FoodExTagTxtCommodity record, @Param("example") FoodExTagTxtCommodityExample example);

    int updateByPrimaryKeySelective(FoodExTagTxtCommodity record);

    int updateByPrimaryKey(FoodExTagTxtCommodity record);
}