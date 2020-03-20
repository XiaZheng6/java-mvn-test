package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TTable;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: 桌台相关
 * @author: jie.pang
 * @create: 2018-07-30 17:17
 **/
public interface TableBusiness {

    Page<TTable> list(PageForm form);

}
