package cn.teamar.genki.pos.basic.vo.power;

import cn.teamar.genki.basic.common.entity.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 角色表单
 * @author: jie.pang
 * @create: 2018-07-31 15:48
 **/
@Setter
@Getter
@ToString
@ApiModel("角色表单")
public class RoleForm extends BaseForm {


    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("权限ID")
    private List<Long> rights;
    @ApiModelProperty("职能ID")
    private List<Long> dutys;


}
