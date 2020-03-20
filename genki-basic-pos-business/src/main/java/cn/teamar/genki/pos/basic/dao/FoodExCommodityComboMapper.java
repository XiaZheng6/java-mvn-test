package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodExCommodityCombo;
import cn.teamar.genki.pos.basic.po.FoodExCommodityComboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodExCommodityComboMapper {
    int countByExample(FoodExCommodityComboExample example);

    int deleteByExample(FoodExCommodityComboExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodExCommodityCombo record);

    int insertSelective(FoodExCommodityCombo record);

    List<FoodExCommodityCombo> selectByExample(FoodExCommodityComboExample example);

    FoodExCommodityCombo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodExCommodityCombo record, @Param("example") FoodExCommodityComboExample example);

    int updateByExample(@Param("record") FoodExCommodityCombo record, @Param("example") FoodExCommodityComboExample example);

    int updateByPrimaryKeySelective(FoodExCommodityCombo record);

    int updateByPrimaryKey(FoodExCommodityCombo record);
}