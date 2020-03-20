package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.po.FoodMenu;
import cn.teamar.genki.pos.basic.po.FoodMenuArea;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.service.FoodMenuService;
import cn.teamar.genki.pos.basic.service.SlotTimeService;
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
 * @description: 展示菜谱控制器
 * @author: gz.huang
 * @create: 2018-08-08 10:18
 **/
@Api(description = "展示菜谱模块")
@RestController
@RequestMapping("/basic/pos-api/exCommodity")
public class FoodMenuController extends BaseController {

    @Autowired
    private FoodMenuService foodMenuService;
    @Autowired
    private SlotTimeService slotTimeService;
    @Autowired
    private AreaService areaService;

    @ApiOperation("模块---菜谱+时段+菜谱区域关联表")
    @PostMapping("/list")
    public Response list(@Valid @RequestBody BaseForm form) {
        addParams(form);
        Map<String,Object> map = new HashMap<>();
        List<FoodMenu> foodMenuList = foodMenuService.foodMenuList(form);
        List<FoodMenuArea> foodMenuAreaList = foodMenuService.foodMenuAreaList(form);
        List<TSlottime> slotTimeList = slotTimeService.getSlotTimeList(form);
        List<TArea> tAreaList = areaService.getAreaList(form);
        map.put("foodMenuList",foodMenuList);
        map.put("foodMenuAreaList",foodMenuAreaList);
        map.put("slotTimeList",slotTimeList);
        map.put("tAreaList",tAreaList);
        return Response.success(map);
    }
}
