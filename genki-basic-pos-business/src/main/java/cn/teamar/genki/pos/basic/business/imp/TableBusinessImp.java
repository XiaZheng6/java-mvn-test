package cn.teamar.genki.pos.basic.business.imp;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.business.TableBusiness;
import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.service.TableService;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-01 16:30
 **/
@Slf4j
@Service
public class TableBusinessImp implements TableBusiness {

    @Autowired
    private TableService tableService;

    @Override
    public Page<TTable> list(PageForm form) {
        return tableService.listTable(form);
    }


}
