package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.dao.FoodExCommodityMapper;
import cn.teamar.genki.pos.basic.po.FoodExCommodity;
import cn.teamar.genki.pos.basic.po.FoodExCommodityExample;
import cn.teamar.genki.pos.basic.service.FoodExCommodityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description: FoodExCommodityService
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
@Slf4j
@Service
public class FoodExCommodityServiceImp implements FoodExCommodityService {

    @Autowired
    private FoodExCommodityMapper foodExCommodityMapper;

    /**
     * 查询商品集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodExCommodity> list(BaseForm form){
        FoodExCommodityExample example = new FoodExCommodityExample();
        FoodExCommodityExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) 1);
        return foodExCommodityMapper.selectByExample(example);
    }

}
