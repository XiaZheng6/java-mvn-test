package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.entity.PageForm;
import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.basic.common.utils.PageSupport;
import cn.teamar.genki.common.tools.response.PageResponse;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.PowerBusiness;
import cn.teamar.genki.pos.basic.business.UserBusiness;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.service.TmService;
import cn.teamar.genki.pos.basic.service.UserService;
import cn.teamar.genki.pos.basic.vo.pos.*;
import cn.teamar.genki.pos.basic.vo.tmService.StoreInfoVo;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: genki-basic-pos
 * @description: 用户控制器
 * @author: jie.pang
 * @create: 2018-08-15 15:24
 **/
@Api(description = "用户权限模块")
@RestController
@RequestMapping("/basic/pos-api/user")
public class UserController extends BaseController {
    @Autowired
    private UserBusiness userBusiness;
    @Autowired
    private PowerBusiness powerBusiness;
    @Autowired
    private UserService userService;
    @Autowired
    private TmService tmService;

    @ApiOperation("用户列表")
    @PostMapping("/list")
    public PageResponse<I_PosUserListVO> listUser(@Valid @RequestBody PageForm form) {
        addParams(form);
        Page<TUser> users = userBusiness.listUsers(form);
        List<Long> userIds = new ArrayList<Long>();
        for(TUser user : users){
            userIds.add(user.getId());
        }
        List<PosUserRightVO> userRightVOList = powerBusiness.selectRightFromUserIds(userIds);
        return PageSupport.response(users, u ->{
            I_PosUserListVO vo = new I_PosUserListVO();
            vo.setId(u.getId());
            vo.setRealName(u.getRealName());
            vo.setPassword(u.getPassword());
            vo.setUserName(u.getUserName());

            List<PosRightVO> rightVOList = new ArrayList<PosRightVO>();
            if(userRightVOList!=null){
                for(PosUserRightVO ur:userRightVOList){
                    if(ur.getUserId() == vo.getId()){
                        PosRightVO rv = new PosRightVO();
                        rv.setRightCode(ur.getRightCode());
                        rv.setRightType(ur.getRightType());
                        rv.setImageUrl(ur.getImageUrl());
                        rv.setRightName(ur.getRightName());
                        rv.setSourcePath(ur.getSourcePath());
                        rightVOList.add(rv);
                    }
                }
            }
            vo.setPowerList(rightVOList);
//            vo.setRights(rightVOList);
            return vo;
        });
    }


    @ApiOperation("不分页用户集合")
    @PostMapping("/getUserList")
    public Response getUserList(@Valid @RequestBody PosLoginVO form, BindingResult bindingResult) {
        addParams(form);
        bindingResult(bindingResult);

        List<TUser> users = userService.selectBySids(form.getSid());
        List<Long> userIds = new ArrayList<Long>();
        for(TUser user : users) {
            userIds.add(user.getId());
        }
        List<PosUserRightVO> userRightVOList = powerBusiness.selectRightFromUserIds(userIds);
        List<I_PosUserListVO> viList = new ArrayList<>();
        for(TUser user : users){
            userIds.add(user.getId());
            I_PosUserListVO vo = new I_PosUserListVO();
            vo.setId(user.getId());
            vo.setRealName(user.getRealName());
            vo.setPassword(user.getPassword());
            vo.setUserName(user.getUserName());

            List<Long> dutyIdList = userService.dutyIdList(user.getId());
            List<Long> rightIdList = userService.rightIdList(user.getId());
            vo.setRoleType(dutyIdList.toString());
            vo.setRightType(rightIdList.toString());

            /*List<PosRightVO> rightVOList = new ArrayList<PosRightVO>();
            if(userRightVOList!=null){
                for(PosUserRightVO ur:userRightVOList){
                    if(ur.getUserId() == vo.getId()){
                        PosRightVO rv = new PosRightVO();
                        rv.setRightCode(ur.getRightCode());
                        rv.setRightType(ur.getRightType());
                        rv.setImageUrl(ur.getImageUrl());
                        rv.setRightName(ur.getRightName());
                        rv.setSourcePath(ur.getSourcePath());
                        rightVOList.add(rv);
                    }
                }
            }
            vo.setPowerList(rightVOList);*/
            viList.add(vo);
        }
        return Response.success(viList);
    }

    @ApiOperation("模块---用户+权限")
    @PostMapping("/getUserRightList")
    public Response getUserRightList(@Valid @RequestBody PosLoginVO form) {
        addParams(form);
        Map<String,Object> map = new HashMap<>();
        List<TUser> userList = userService.selectBySids(form.getSid());
        List<Long> userIds = new ArrayList<Long>();
        if(userList!=null&&userList.size()>0){
            for(TUser user : userList) {
                userIds.add(user.getId());
            }
            List<PosUserRightVO> userRightVOList = powerBusiness.selectRightFromUserIds(userIds);
            map.put("userList",userList);
            map.put("userRightVOList",userRightVOList);
        }
        return Response.success(map);
    }


    @ApiOperation("查询商户信息---invalid")
    @PostMapping("/getStoreInfo/{storeId}")
    public Response<StoreInfoVo> getStoreInfo(@PathVariable("storeId") String storeId) {
        return tmService.getStoreInfo(storeId);
    }

    @ApiOperation("修改密码")
    @PostMapping("/updatePassWord")
    public Response<TUser> updatePassWord(@Valid @RequestBody PosLoginVO form) {
        return Response.success(userService.updatePassWord(form.getUserId(),form.getOldPassWord(),form.getNewPassWord()));
    }
}
