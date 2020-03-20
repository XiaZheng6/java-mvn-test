package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodCommodity;
import cn.teamar.genki.pos.basic.po.FoodCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodCommodityMapper {
    int countByExample(FoodCommodityExample example);

    int deleteByExample(FoodCommodityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodCommodity record);

    int insertSelective(FoodCommodity record);

    List<FoodCommodity> selectByExample(FoodCommodityExample example);

    FoodCommodity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodCommodity record, @Param("example") FoodCommodityExample example);

    int updateByExample(@Param("record") FoodCommodity record, @Param("example") FoodCommodityExample example);

    int updateByPrimaryKeySelective(FoodCommodity record);

    int updateByPrimaryKey(FoodCommodity record);

    List<Long> selectListCommodityIdByPrinterId(List<String> id);
}