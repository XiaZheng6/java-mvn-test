package cn.teamar.genki.pos.basic.controller;

import cn.teamar.genki.basic.common.utils.BaseController;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.business.PowerBusiness;
import cn.teamar.genki.pos.basic.business.imp.UserBusinessImp;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.service.TmService;
import cn.teamar.genki.pos.basic.service.UserService;
import cn.teamar.genki.pos.basic.vo.pos.*;
import cn.teamar.genki.pos.basic.vo.tmService.StoreInfoVo;
import io.swagger.annotations.Api;
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
 * @description: 登录控制器
 * @author: jie.pang
 * @create: 2018-07-27 19:15
 **/

@Api(description = "登录登出")
@RestController
@RequestMapping("/basic/pos-api")
public class LoginController extends BaseController {

    @Autowired
    private UserBusinessImp userBusiness;
    @Autowired
    private UserService userService;
    @Autowired
    private PowerBusiness powerBusiness;
    @Autowired
    private TmService tmService;



    @PostMapping("/login")
    public Response<PosLoginVO> login(@Valid @RequestBody PosLoginForm posLoginForm,BindingResult bindingResult) {
        bindingResult(bindingResult);
        PosLoginVO posLoginVO = userBusiness.posLogin(posLoginForm);
        if(posLoginVO!=null){
            List<Long> userIdList = new ArrayList<>();
            userIdList.add(posLoginVO.getUserId());
            List<PosUserRightVO> userRightVOList = powerBusiness.selectRightFromUserIds(userIdList);

            List<Long> dutyIdList = userService.dutyIdList(posLoginVO.getUserId());
            posLoginVO.setRoleType(dutyIdList.toString());

            List<PosRightVO> rightVOList = new ArrayList<PosRightVO>();
            if(userRightVOList!=null) {
                for (PosUserRightVO ur : userRightVOList) {
                    if (ur.getUserId() == posLoginVO.getUserId()) {
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
            posLoginVO.setPowerList(rightVOList);
            String storeId = posLoginVO.getSid()+"";
            Response<StoreInfoVo> response = tmService.getStoreInfo(storeId);
            if(response.getCode()==200)
                posLoginVO.setStoreInfoVo(response.getData());
        }
        return Response.success(posLoginVO);
    }
}
