package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.FoodMenu;
import cn.teamar.genki.pos.basic.po.FoodMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMenuMapper {
    int countByExample(FoodMenuExample example);

    int deleteByExample(FoodMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMenu record);

    int insertSelective(FoodMenu record);

    List<FoodMenu> selectByExample(FoodMenuExample example);

    FoodMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMenu record, @Param("example") FoodMenuExample example);

    int updateByExample(@Param("record") FoodMenu record, @Param("example") FoodMenuExample example);

    int updateByPrimaryKeySelective(FoodMenu record);

    int updateByPrimaryKey(FoodMenu record);
}