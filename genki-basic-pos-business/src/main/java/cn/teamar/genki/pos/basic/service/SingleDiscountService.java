package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.pos.basic.po.TSingleDiscount;

import java.util.List;

public interface SingleDiscountService {
    List<TSingleDiscount> list(BaseForm form);
}
