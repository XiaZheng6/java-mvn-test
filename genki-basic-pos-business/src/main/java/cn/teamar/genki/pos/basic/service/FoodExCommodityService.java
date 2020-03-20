package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.FoodExCommodity;
import cn.teamar.genki.pos.basic.vo.foodExCommodity.FoodExCommdityForm;

import java.util.List;

/**
 * @program: genki-basic
 * @description: UserServiceImp
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
public interface FoodExCommodityService {

    /**
     * 查询商品集合数据
     * @param form
     * @return
     */
    List<FoodExCommodity> list(BaseForm form);
}
