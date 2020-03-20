package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TArea;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 区域
 * @author: jie.pang
 * @create: 2018-07-31 11:50
 **/
public interface AreaService {
    /**
     * 列表
     * @param form
     * @return
     */
    Page<TArea> listArea(PageForm form);


    List<TArea> getAreaList(BaseForm form);
}
