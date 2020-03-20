package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.basic.common.utils.PageSupport;
import cn.teamar.genki.common.tools.response.PageResponse;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.TableBusiness;
import cn.teamar.genki.pos.basic.po.TArea;
import cn.teamar.genki.pos.basic.po.TRemark;
import cn.teamar.genki.pos.basic.po.TTable;
import cn.teamar.genki.pos.basic.service.AreaService;
import cn.teamar.genki.pos.basic.service.TableService;
import cn.teamar.genki.pos.basic.vo.pos.TableVO;
import cn.teamar.genki.pos.basic.vo.table.TableForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-01 16:25
 **/
@Slf4j
@RestController
@RequestMapping("/basic/pos-api/table")
@Api(description = "桌台管理")
public class TableController extends BaseController {

    @Autowired
    private TableBusiness tableBusiness;
    @Autowired
    private TableService tableService;
    @Autowired
    private AreaService areaService;

    @ApiOperation("列表")
    @PostMapping("/list")
    public PageResponse<TableVO> list(@Valid @RequestBody PageForm form) {
        addParams(form);
        return PageSupport.response(tableBusiness.list(form), table -> {
            TableVO vo = new TableVO();
            vo.setTableCloudId(table.getId());
            vo.setAreaId(table.getAreaId());
            vo.setCount(table.getDefaultNum());
            vo.setTableName(table.getTableName());
            vo.setWeight(table.getId().intValue());
            vo.setTableCode(table.getTableCode());
            return vo;
        });
    }

    @ApiOperation("列表")
    @PostMapping("/getTableList")
    public Response getTableList(@Valid @RequestBody BaseForm form) {
        addParams(form);
        Map<String,Object> map = new HashMap<>();
        List<TTable> tTableList = tableService.tableList(form);
        List<TArea> tAreaList = areaService.getAreaList(form);

        map.put("tableList",tTableList);
        map.put("areaList",tAreaList);
        return Response.success(map);
    }
}
