package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.service.PaymentManagerService;
import cn.teamar.genki.pos.basic.service.SingleDiscountService;
import cn.teamar.genki.pos.basic.service.TableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: PaymentManagerController
 * @descript: 支付对外接口API
 * @date: 2018/9/12 15:45
 * @author HuaZi
 */
@Api(description = "支付模块")
@RestController
@RequestMapping("/basic/pos-api/paymentManager")
public class PaymentManagerController extends BaseController {

    @Autowired
    private PaymentManagerService paymentManagerService;
    @Autowired
    private SingleDiscountService singleDiscountService;
    @Autowired
    private TableService tableService;

    @ApiOperation("支付模块---支付集合")
    @PostMapping("/list")
    public Response list(@Valid @RequestBody BaseForm form) {
        addParams(form);
        Map<String,Object> map = new HashMap<>();
        List<TPaymentManager> paymentManagerList = paymentManagerService.list(form);
        List<TSingleDiscount> singleDiscountList = singleDiscountService.list(form);
        List<TRemark> tRemarkList = tableService.remarkList(form);
        map.put("paymentManagerList",paymentManagerList);
        map.put("singleDiscountList",singleDiscountList);
        map.put("tRemarkList",tRemarkList);
        return Response.success(map);
    }

}
