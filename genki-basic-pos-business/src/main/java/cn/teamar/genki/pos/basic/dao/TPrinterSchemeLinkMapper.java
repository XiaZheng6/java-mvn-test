package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPrinterSchemeLink;
import cn.teamar.genki.pos.basic.po.TPrinterSchemeLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrinterSchemeLinkMapper {
    int countByExample(TPrinterSchemeLinkExample example);

    int deleteByExample(TPrinterSchemeLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrinterSchemeLink record);

    int insertSelective(TPrinterSchemeLink record);

    List<TPrinterSchemeLink> selectByExample(TPrinterSchemeLinkExample example);

    TPrinterSchemeLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPrinterSchemeLink record, @Param("example") TPrinterSchemeLinkExample example);

    int updateByExample(@Param("record") TPrinterSchemeLink record, @Param("example") TPrinterSchemeLinkExample example);

    int updateByPrimaryKeySelective(TPrinterSchemeLink record);

    int updateByPrimaryKey(TPrinterSchemeLink record);
    List<String> selectSchemeListNameByPrinterId(Long id);
}