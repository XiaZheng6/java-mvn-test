package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPrintTemplateBase;
import cn.teamar.genki.pos.basic.po.TPrintTemplateBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrintTemplateBaseMapper {
    int countByExample(TPrintTemplateBaseExample example);

    int deleteByExample(TPrintTemplateBaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrintTemplateBase record);

    int insertSelective(TPrintTemplateBase record);

    List<TPrintTemplateBase> selectByExample(TPrintTemplateBaseExample example);

    TPrintTemplateBase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPrintTemplateBase record, @Param("example") TPrintTemplateBaseExample example);

    int updateByExample(@Param("record") TPrintTemplateBase record, @Param("example") TPrintTemplateBaseExample example);

    int updateByPrimaryKeySelective(TPrintTemplateBase record);

    int updateByPrimaryKey(TPrintTemplateBase record);
}