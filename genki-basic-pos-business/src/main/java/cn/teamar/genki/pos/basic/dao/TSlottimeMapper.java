package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.po.TSlottimeExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.po.TSlottimeExample;
import org.apache.ibatis.annotations.Param;

public interface TSlottimeMapper {
    int countByExample(TSlottimeExample example);

    int deleteByExample(TSlottimeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSlottime record);

    int insertSelective(TSlottime record);

    List<TSlottime> selectByExample(TSlottimeExample example);

    TSlottime selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TSlottime record, @Param("example") TSlottimeExample example);

    int updateByExample(@Param("record") TSlottime record, @Param("example") TSlottimeExample example);

    int updateByPrimaryKeySelective(TSlottime record);

    int updateByPrimaryKey(TSlottime record);
}