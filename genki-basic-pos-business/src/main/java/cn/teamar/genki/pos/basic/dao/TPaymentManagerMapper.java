package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPaymentManager;
import cn.teamar.genki.pos.basic.po.TPaymentManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPaymentManagerMapper {
    int countByExample(TPaymentManagerExample example);

    int deleteByExample(TPaymentManagerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPaymentManager record);

    int insertSelective(TPaymentManager record);

    List<TPaymentManager> selectByExample(TPaymentManagerExample example);

    TPaymentManager selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPaymentManager record, @Param("example") TPaymentManagerExample example);

    int updateByExample(@Param("record") TPaymentManager record, @Param("example") TPaymentManagerExample example);

    int updateByPrimaryKeySelective(TPaymentManager record);

    int updateByPrimaryKey(TPaymentManager record);
}