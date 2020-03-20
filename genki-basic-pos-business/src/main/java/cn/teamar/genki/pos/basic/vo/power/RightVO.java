package cn.teamar.genki.pos.basic.vo.power;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 角色视图
 * @author: jie.pang
 * @create: 2018-07-31 15:48
 **/
@Setter
@Getter
@ToString
@ApiModel("权限视图")
public class RightVO {
    @ApiModelProperty("角色名称")
    private String rightName;
    @ApiModelProperty("ID")
    private Long id ;

}
