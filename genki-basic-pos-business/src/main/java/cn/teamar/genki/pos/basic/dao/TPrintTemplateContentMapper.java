package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPrintTemplateContent;
import cn.teamar.genki.pos.basic.po.TPrintTemplateContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrintTemplateContentMapper {
    int countByExample(TPrintTemplateContentExample example);

    int deleteByExample(TPrintTemplateContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrintTemplateContent record);

    int insertSelective(TPrintTemplateContent record);

    List<TPrintTemplateContent> selectByExampleWithBLOBs(TPrintTemplateContentExample example);

    List<TPrintTemplateContent> selectByExample(TPrintTemplateContentExample example);

    TPrintTemplateContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPrintTemplateContent record, @Param("example") TPrintTemplateContentExample example);

    int updateByExampleWithBLOBs(@Param("record") TPrintTemplateContent record, @Param("example") TPrintTemplateContentExample example);

    int updateByExample(@Param("record") TPrintTemplateContent record, @Param("example") TPrintTemplateContentExample example);

    int updateByPrimaryKeySelective(TPrintTemplateContent record);

    int updateByPrimaryKeyWithBLOBs(TPrintTemplateContent record);

    int updateByPrimaryKey(TPrintTemplateContent record);
}