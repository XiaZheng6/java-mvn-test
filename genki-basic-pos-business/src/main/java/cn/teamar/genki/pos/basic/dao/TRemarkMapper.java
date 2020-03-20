package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TRemark;
import cn.teamar.genki.pos.basic.po.TRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRemarkMapper {
    int countByExample(TRemarkExample example);

    int deleteByExample(TRemarkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRemark record);

    int insertSelective(TRemark record);

    List<TRemark> selectByExample(TRemarkExample example);

    TRemark selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRemark record, @Param("example") TRemarkExample example);

    int updateByExample(@Param("record") TRemark record, @Param("example") TRemarkExample example);

    int updateByPrimaryKeySelective(TRemark record);

    int updateByPrimaryKey(TRemark record);
}