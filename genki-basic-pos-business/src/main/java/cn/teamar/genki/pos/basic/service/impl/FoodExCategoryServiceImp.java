package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.dao.FoodExCategoryMapper;
import cn.teamar.genki.pos.basic.dao.FoodExCommodityComboMapper;
import cn.teamar.genki.pos.basic.dao.FoodExSpecRefMapper;
import cn.teamar.genki.pos.basic.dao.FoodExTagTxtCommodityMapper;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.FoodExCategoryService;
import cn.teamar.genki.pos.basic.vo.foodExCategory.FoodExCategoryForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description: FoodExCategoryService
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
@Slf4j
@Service
public class FoodExCategoryServiceImp implements FoodExCategoryService {

    @Autowired
    private FoodExCategoryMapper foodExCategoryMapper;
    @Autowired
    private FoodExCommodityComboMapper foodExCommodityComboMapper;
    @Autowired
    private FoodExSpecRefMapper foodExSpecRefMapper;
    @Autowired
    private FoodExTagTxtCommodityMapper foodExTagTxtCommodityMapper;

    /**
     * 查询分类集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodExCategory> foodExCategoryList(BaseForm form){
        FoodExCategoryExample example = new FoodExCategoryExample();
        FoodExCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) 1);
        example.setOrderByClause("sort_code DESC,id DESC");
        return foodExCategoryMapper.selectByExample(example);
    }

    /**
     * 查询商品套餐集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodExCommodityCombo> foodExCommodityComboList(BaseForm form){
        FoodExCommodityComboExample example = new FoodExCommodityComboExample();
        FoodExCommodityComboExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) 1);
        return foodExCommodityComboMapper.selectByExample(example);
    }

    /**
     * 查询商品规格集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodExSpecRef> foodExSpecRefList(BaseForm form){
        FoodExSpecRefExample example = new FoodExSpecRefExample();
        FoodExSpecRefExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) 1);
        return foodExSpecRefMapper.selectByExample(example);
    }

    /**
     * 查询商品文字标签集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodExTagTxtCommodity> foodExTagTxtCommodityList(BaseForm form){
        FoodExTagTxtCommodityExample example = new FoodExTagTxtCommodityExample();
        FoodExTagTxtCommodityExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        return foodExTagTxtCommodityMapper.selectByExample(example);
    }

}
