package cn.teamar.genki.pos.basic.dao;

import cn.teamar.genki.pos.basic.po.TPrintPrinter;
import cn.teamar.genki.pos.basic.po.TPrintPrinterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPrintPrinterMapper {
    int countByExample(TPrintPrinterExample example);

    int deleteByExample(TPrintPrinterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPrintPrinter record);

    int insertSelective(TPrintPrinter record);

    List<TPrintPrinter> selectByExample(TPrintPrinterExample example);

    TPrintPrinter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPrintPrinter record, @Param("example") TPrintPrinterExample example);

    int updateByExample(@Param("record") TPrintPrinter record, @Param("example") TPrintPrinterExample example);

    int updateByPrimaryKeySelective(TPrintPrinter record);

    int updateByPrimaryKey(TPrintPrinter record);
}