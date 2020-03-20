package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.FoodExCommodity;
import cn.teamar.genki.pos.basic.po.FoodMenu;
import cn.teamar.genki.pos.basic.po.FoodMenuArea;
import cn.teamar.genki.pos.basic.vo.foodExCommodity.FoodExCommdityForm;

import java.util.List;

/**
 * @program: genki-basic
 * @description: UserServiceImp
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
public interface FoodMenuService {

    List<FoodMenu> foodMenuList(BaseForm form);

    List<FoodMenuArea> foodMenuAreaList(BaseForm form);
}
