package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TDuty;
import cn.teamar.genki.pos.basic.po.TDutyExample;
import java.util.List;

import cn.teamar.genki.pos.basic.po.TDuty;
import cn.teamar.genki.pos.basic.po.TDutyExample;
import org.apache.ibatis.annotations.Param;

public interface TDutyMapper {
    int countByExample(TDutyExample example);

    int deleteByExample(TDutyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TDuty record);

    int insertSelective(TDuty record);

    List<TDuty> selectByExample(TDutyExample example);

    TDuty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TDuty record, @Param("example") TDutyExample example);

    int updateByExample(@Param("record") TDuty record, @Param("example") TDutyExample example);

    int updateByPrimaryKeySelective(TDuty record);

    int updateByPrimaryKey(TDuty record);
}