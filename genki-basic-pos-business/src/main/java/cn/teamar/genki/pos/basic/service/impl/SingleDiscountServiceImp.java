package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.pos.basic.dao.TSingleDiscountMapper;
import cn.teamar.genki.pos.basic.po.TPaymentManager;
import cn.teamar.genki.pos.basic.po.TPaymentManagerExample;
import cn.teamar.genki.pos.basic.po.TSingleDiscount;
import cn.teamar.genki.pos.basic.po.TSingleDiscountExample;
import cn.teamar.genki.pos.basic.service.SingleDiscountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: SingleDiscountServiceImp
 * @descript: 整单折扣管理实现类
 * @date: 2018/9/12 15:41
 * @author HuaZi
 */
@Slf4j
@Service
public class SingleDiscountServiceImp implements SingleDiscountService {

    @Autowired
    private TSingleDiscountMapper singleDiscountMapper;

    /**
     * 查询整单折扣集合数据
     * @param form
     * @return
     */
    @Override
    public List<TSingleDiscount> list(BaseForm form){
        TSingleDiscountExample example = new TSingleDiscountExample();
        TSingleDiscountExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        criteria.andStateEqualTo(DataStateEnum.DATA_STATE_ENABLE.getCodeAsByte());
        return singleDiscountMapper.selectByExample(example);
    }


}
