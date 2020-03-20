package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TRemark;
import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.vo.table.TableForm;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 桌台管理
 * @author: jie.pang
 * @create: 2018-07-31 11:50
 **/
public interface TableService {
    /**
     * 列表
     * @param form
     * @return
     */
    Page<TTable> listTable(PageForm form);


    List<TTable> tableList(BaseForm form);

    List<TRemark> remarkList(BaseForm form);
}
