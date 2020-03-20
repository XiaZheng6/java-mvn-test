package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.basic.common.utils.PageSupport;
import cn.teamar.genki.common.tools.response.PageResponse;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.SlotTimeBusiness;
import cn.teamar.genki.pos.basic.po.TSlottime;
import cn.teamar.genki.pos.basic.service.SlotTimeService;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeForm;
import cn.teamar.genki.pos.basic.vo.slottime.SlotTimeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 16:49
 **/
@Slf4j
@RestController
@RequestMapping("/basic/pos-api/slottime")
@Api(description = "时段管理")
public class SlotTimeController extends BaseController {
    @Autowired
    private SlotTimeBusiness slotTimeBusiness;
    @Autowired
    private SlotTimeService slotTimeService;

    @ApiOperation("列表")
    @PostMapping("/list")
    public PageResponse<SlotTimeVO> list(@Valid @RequestBody PageForm form) {
        addParams(form);
        return PageSupport.response(slotTimeBusiness.list(form), entity -> {
            SlotTimeVO vo = new SlotTimeVO();
            vo.setId(entity.getId());
            vo.setSlotName(entity.getSlotTime());
            vo.setSlotStart(entity.getSlotStart());
            vo.setSlotEnd(entity.getSlotEnd());
            return vo;
        });
    }


    @ApiOperation("不分页列表")
    @PostMapping("/getSlotTimeList")
    public Response getSlotTimeList(@Valid @RequestBody BaseForm form) {
        addParams(form);
        List<TSlottime> list = slotTimeService.getSlotTimeList(form);
        return Response.success(list);
    }
}
