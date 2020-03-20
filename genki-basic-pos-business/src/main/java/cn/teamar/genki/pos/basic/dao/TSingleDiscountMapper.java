package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TSingleDiscount;
import cn.teamar.genki.pos.basic.po.TSingleDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSingleDiscountMapper {
    int countByExample(TSingleDiscountExample example);

    int deleteByExample(TSingleDiscountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSingleDiscount record);

    int insertSelective(TSingleDiscount record);

    List<TSingleDiscount> selectByExample(TSingleDiscountExample example);

    TSingleDiscount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSingleDiscount record, @Param("example") TSingleDiscountExample example);

    int updateByExample(@Param("record") TSingleDiscount record, @Param("example") TSingleDiscountExample example);

    int updateByPrimaryKeySelective(TSingleDiscount record);

    int updateByPrimaryKey(TSingleDiscount record);
}