package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.dao.TPaymentManagerMapper;
import cn.teamar.genki.pos.basic.po.FoodExCommodity;
import cn.teamar.genki.pos.basic.po.FoodExCommodityExample;
import cn.teamar.genki.pos.basic.po.TPaymentManager;
import cn.teamar.genki.pos.basic.po.TPaymentManagerExample;
import cn.teamar.genki.pos.basic.service.PaymentManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: PaymentManagerServiceImp
 * @descript: 支付管理实现类
 * @date: 2018/9/12 15:41
 * @author HuaZi
 */
@Slf4j
@Service
public class PaymentManagerServiceImp implements PaymentManagerService {

    @Autowired
    private TPaymentManagerMapper paymentManagerMapper;

    /**
     * 查询支付集合数据
     * @param form
     * @return
     */
    @Override
    public List<TPaymentManager> list(BaseForm form){
        TPaymentManagerExample example = new TPaymentManagerExample();
        TPaymentManagerExample.Criteria criteria = example.createCriteria();
        TPaymentManagerExample.Criteria cr = example.createCriteria();
        criteria.andSIdEqualTo(form.getSid());
        cr.andSIdIsNull();
        criteria.andStateEqualTo((byte) 1);
        example.or(cr);
        return paymentManagerMapper.selectByExample(example);
    }


}
