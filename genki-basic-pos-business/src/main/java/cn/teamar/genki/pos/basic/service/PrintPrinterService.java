package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.TPrintPrinter;

import java.util.List;

public interface PrintPrinterService {
    List<TPrintPrinter> list(BaseForm form);
}
