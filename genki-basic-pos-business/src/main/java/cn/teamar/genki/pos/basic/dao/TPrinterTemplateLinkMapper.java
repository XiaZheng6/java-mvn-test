package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPrinterTemplateLink;
import cn.teamar.genki.pos.basic.po.TPrinterTemplateLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrinterTemplateLinkMapper {
    int countByExample(TPrinterTemplateLinkExample example);

    int deleteByExample(TPrinterTemplateLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrinterTemplateLink record);

    int insertSelective(TPrinterTemplateLink record);

    List<TPrinterTemplateLink> selectByExample(TPrinterTemplateLinkExample example);

    TPrinterTemplateLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPrinterTemplateLink record, @Param("example") TPrinterTemplateLinkExample example);

    int updateByExample(@Param("record") TPrinterTemplateLink record, @Param("example") TPrinterTemplateLinkExample example);

    int updateByPrimaryKeySelective(TPrinterTemplateLink record);

    int updateByPrimaryKey(TPrinterTemplateLink record);
}