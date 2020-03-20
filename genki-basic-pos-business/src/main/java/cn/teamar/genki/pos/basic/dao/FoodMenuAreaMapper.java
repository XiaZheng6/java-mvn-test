package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodMenuArea;
import cn.teamar.genki.pos.basic.po.FoodMenuAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMenuAreaMapper {
    int countByExample(FoodMenuAreaExample example);

    int deleteByExample(FoodMenuAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMenuArea record);

    int insertSelective(FoodMenuArea record);

    List<FoodMenuArea> selectByExample(FoodMenuAreaExample example);

    FoodMenuArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMenuArea record, @Param("example") FoodMenuAreaExample example);

    int updateByExample(@Param("record") FoodMenuArea record, @Param("example") FoodMenuAreaExample example);

    int updateByPrimaryKeySelective(FoodMenuArea record);

    int updateByPrimaryKey(FoodMenuArea record);
}