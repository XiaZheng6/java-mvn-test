package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.po.*;
import cn.teamar.genki.pos.basic.service.FoodExCategoryService;
import cn.teamar.genki.pos.basic.service.FoodExCommodityService;
import cn.teamar.genki.pos.basic.service.PrintPrinterService;
import cn.teamar.genki.pos.basic.vo.foodExCategory.FoodExCategoryForm;
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
 * @program: genki-basic-pos
 * @description: 展示分类控制器
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
@Api(description = "展示分类模块")
@RestController
@RequestMapping("/basic/pos-api/exCategory")
public class FoodExCategoryController extends BaseController {

    @Autowired
    private FoodExCategoryService foodExCategoryService;
    @Autowired
    private FoodExCommodityService foodExCommodityService;
    @Autowired
    private PrintPrinterService printPrinterService;

    @ApiOperation("模块---分类+商品+规格+文字标签+套餐商品集合")
    @PostMapping("/list")
    public Response list(@Valid @RequestBody BaseForm form) {
        addParams(form);
        Map<String,Object> map = new HashMap<>();
        List<FoodExCategory> foodExCategoryList = foodExCategoryService.foodExCategoryList(form);
        List<FoodExCommodity> foodExCommodityList = foodExCommodityService.list(form);
        List<FoodExCommodityCombo> foodExCommodityComboList = foodExCategoryService.foodExCommodityComboList(form);
        List<FoodExSpecRef> foodExSpecRefList = foodExCategoryService.foodExSpecRefList(form);
        List<FoodExTagTxtCommodity> foodExTagTxtCommodityList = foodExCategoryService.foodExTagTxtCommodityList(form);
        List<TPrintPrinter> printPrinterList = printPrinterService.list(form);
        map.put("foodExCategoryList",foodExCategoryList);
        map.put("foodExCommodityList",foodExCommodityList);
        map.put("foodExCommodityComboList",foodExCommodityComboList);
        map.put("foodExSpecRefList",foodExSpecRefList);
        map.put("foodExTagTxtCommodityList",foodExTagTxtCommodityList);
        map.put("printPrinterList",printPrinterList);
        return Response.success(map);
    }
}
