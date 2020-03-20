package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.PowerEnum;
import cn.teamar.genki.pos.basic.dao.TRightMapper;
import cn.teamar.genki.pos.basic.po.TRight;
import cn.teamar.genki.pos.basic.po.TRightExample;
import cn.teamar.genki.pos.basic.service.RightService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-07-31 18:32
 **/
@Slf4j
@Service
public class RightServiceImp implements RightService {

    @Autowired
    private TRightMapper rightMapper;


    /**
     * 分页查询 saas 权限
     * @param form
     * @return
     */
    @Override
    public Page<TRight> listRightForSaaS(PageForm form) {
        TRightExample ex = new TRightExample();
        ex.createCriteria().andRightTypeEqualTo((byte)PowerEnum.RIGHT_TYPE_SAAS_MENU.getCode());
        Page<TRight> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        rightMapper.selectByExample(ex);
        return result;
    }
    /**
     * 分页查询 pos权限
     * @param form
     * @return
     */
    @Override
    public Page<TRight> listRightForPOS(PageForm form) {
        TRightExample ex = new TRightExample();
        ex.createCriteria().andRightTypeEqualTo((byte)PowerEnum.RIGHT_TYPE_POS_ACTION.getCode());
        Page<TRight> result = PageHelper.offsetPage(form.getOffset(),form.getSize());
        rightMapper.selectByExample(ex);
        return result;
    }
}
