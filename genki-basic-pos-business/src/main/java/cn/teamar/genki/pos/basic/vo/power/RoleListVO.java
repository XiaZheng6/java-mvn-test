package cn.teamar.genki.pos.basic.vo.power;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @program: genki-basic
 * @description: 角色列表视图
 * @author: jie.pang
 * @create: 2018-07-31 15:48
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel("角色列表视图")
public class RoleListVO {
    @ApiModelProperty("角色ID")
    private Long id;
    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("数据状态")
    private String stateCode;
}
