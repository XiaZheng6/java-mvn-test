package cn.teamar.genki.pos.basic.business;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.vo.area.AreaForm;
import cn.teamar.genki.pos.basic.vo.area.AreaVO;
import com.github.pagehelper.Page;

/**
 * @program: genki-basic
 * @description: 区域相关
 * @author: jie.pang
 * @create: 2018-07-30 17:17
 **/
public interface AreaBusiness {

    Page<TArea> list(PageForm form);


}
