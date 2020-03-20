package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.dao.FoodExCommodityMapper;
import cn.teamar.genki.pos.basic.dao.FoodMenuAreaMapper;
import cn.teamar.genki.pos.basic.dao.FoodMenuMapper;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.FoodExCommodityService;
import cn.teamar.genki.pos.basic.service.FoodMenuService;
import cn.teamar.genki.pos.basic.service.SlotTimeService;
import cn.teamar.genki.pos.basic.vo.foodExCommodity.FoodExCommdityForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description: FoodMenuService
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
@Slf4j
@Service
public class FoodMenuServiceImp implements FoodMenuService {

    @Autowired
    private FoodMenuMapper foodMenuMapper;
    @Autowired
    private FoodMenuAreaMapper foodMenuAreaMapper;


    /**
     * 查询菜谱集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodMenu> foodMenuList(BaseForm form){
        FoodMenuExample example = new FoodMenuExample();
        FoodMenuExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo((byte) 1);
        criteria.andStatusEqualTo((byte) 0);
        return foodMenuMapper.selectByExample(example);
    }

    /**
     * 查询菜谱集合数据
     * @param form
     * @return
     */
    @Override
    public List<FoodMenuArea> foodMenuAreaList(BaseForm form){
        FoodMenuAreaExample example = new FoodMenuAreaExample();
        FoodMenuAreaExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        return foodMenuAreaMapper.selectByExample(example);
    }

}
