package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.FoodExCategory;
import cn.teamar.genki.pos.basic.po.FoodExCommodityCombo;
import cn.teamar.genki.pos.basic.po.FoodExSpecRef;
import cn.teamar.genki.pos.basic.po.FoodExTagTxtCommodity;

import java.util.List;

/**
 * @program: genki-basic
 * @description: FoodExCategoryServiceImp
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
public interface FoodExCategoryService{

    /**
     * 查询分类集合数据
     * @param form
     * @return
     */
    List<FoodExCategory> foodExCategoryList(BaseForm form);

    /**
     * 查询商品套餐集合数据
     * @param form
     * @return
     */
    List<FoodExCommodityCombo> foodExCommodityComboList(BaseForm form);

    /**
     * 查询商品规格集合数据
     * @param form
     * @return
     */
    List<FoodExSpecRef> foodExSpecRefList(BaseForm form);

    /**
     * 查询商品文字标签集合数据
     * @param form
     * @return
     */
    List<FoodExTagTxtCommodity> foodExTagTxtCommodityList(BaseForm form);
}
