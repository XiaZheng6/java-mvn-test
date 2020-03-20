package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TGroup;
import cn.teamar.genki.pos.basic.po.TGroupExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TGroup;
import cn.teamar.genki.pos.basic.po.TGroupExample;
import org.apache.ibatis.annotations.Param;

public interface TGroupMapper {
    int countByExample(TGroupExample example);

    int deleteByExample(TGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    List<TGroup> selectByExample(TGroupExample example);

    TGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByExample(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}