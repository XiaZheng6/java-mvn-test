package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.basic.common.utils.PageSupport;
import cn.teamar.genki.common.tools.response.PageResponse;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.AreaBusiness;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.vo.area.AreaForm;
import cn.teamar.genki.pos.basic.vo.area.AreaListVO;
import cn.teamar.genki.pos.basic.vo.pos.PosLoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: genki-basic
 * @description: 区域管理
 * @author: jie.pang
 * @create: 2018-08-01 14:37
 **/
@Slf4j
@RestController
@RequestMapping("/basic/pos-api/area")
@Api(description = "区域管理")
public class AreaController extends BaseController {

    @Autowired
    private AreaBusiness areaBusiness;
    @Autowired
    private AreaService areaService;

    @ApiOperation("列表")
    @PostMapping("/list")
    public PageResponse<AreaListVO> list(@Valid @RequestBody PageForm form) {
        addParams(form);
        return PageSupport.response(areaBusiness.list(form), area -> {
            AreaListVO vo = new AreaListVO();
            vo.setAreaName(area.getAreaName());
            vo.setStateCode(DataStateEnum.forCode(area.getState()).getName());
            vo.setId(area.getId());
            return vo;
        });
    }

    @ApiOperation("不分页列表")
    @PostMapping("/getAreaList")
    public Response getUserList(@Valid @RequestBody BaseForm form, BindingResult bindingResult) {
        addParams(form);
        bindingResult(bindingResult);
        List<TArea> tAreaList = areaService.getAreaList(form);
        return Response.success(tAreaList);
    }
}
