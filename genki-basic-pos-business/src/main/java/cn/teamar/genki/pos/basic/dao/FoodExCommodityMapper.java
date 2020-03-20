package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodExCommodity;
import cn.teamar.genki.pos.basic.po.FoodExCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodExCommodityMapper {
    int countByExample(FoodExCommodityExample example);

    int deleteByExample(FoodExCommodityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodExCommodity record);

    int insertSelective(FoodExCommodity record);

    List<FoodExCommodity> selectByExample(FoodExCommodityExample example);

    FoodExCommodity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodExCommodity record, @Param("example") FoodExCommodityExample example);

    int updateByExample(@Param("record") FoodExCommodity record, @Param("example") FoodExCommodityExample example);

    int updateByPrimaryKeySelective(FoodExCommodity record);

    int updateByPrimaryKey(FoodExCommodity record);
}