package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TBrand;
import cn.teamar.genki.pos.basic.po.TBrandExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TBrand;
import cn.teamar.genki.pos.basic.po.TBrandExample;
import org.apache.ibatis.annotations.Param;

public interface TBrandMapper {
    int countByExample(TBrandExample example);

    int deleteByExample(TBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBrand record);

    int insertSelective(TBrand record);

    List<TBrand> selectByExample(TBrandExample example);

    TBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBrand record, @Param("example") TBrandExample example);

    int updateByExample(@Param("record") TBrand record, @Param("example") TBrandExample example);

    int updateByPrimaryKeySelective(TBrand record);

    int updateByPrimaryKey(TBrand record);
}