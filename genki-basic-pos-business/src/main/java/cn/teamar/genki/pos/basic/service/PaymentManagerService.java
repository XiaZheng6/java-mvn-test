package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.TPaymentManager;

import java.util.List;
/**
 * @className: PaymentManagerService
 * @descript: 支付管理接口类
 * @date: 2018/9/12 15:40
 * @author HuaZi
 */
public interface PaymentManagerService {

    /**
     * 查询支付集合数据
     * @param form
     * @return
     */
    List<TPaymentManager> list(BaseForm form);
}
