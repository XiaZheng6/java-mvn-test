package cn.teamar.genki.pos.basic.vo.pos;

import cn.teamar.genki.basic.common.entity.BaseForm;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.pos.basic.vo.tmService.StoreInfoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: genki-basic-pos
 * @description: POS登录VO
 * @author: jie.pang
 * @create: 2018-08-14 18:47
 **/
@Setter
@Getter
@ToString
@ApiModel
public class PosLoginVO extends BaseForm {
    @ApiModelProperty("用户类型")
    private Byte userType;
    //角色名称
    private String roleType;
    private Byte isPrimary;
    //权限
    private List<PosRightVO> powerList;
    private StoreInfoVo storeInfoVo; //商户信息
    @ApiModelProperty("修改密码用户ID")
    private Long userId;
    @ApiModelProperty("旧密码")
    private String oldPassWord;
    @ApiModelProperty("新密码")
    private String newPassWord;
}
