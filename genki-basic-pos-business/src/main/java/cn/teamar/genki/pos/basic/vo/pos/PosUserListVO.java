

package cn.teamar.genki.pos.basic.vo.pos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 列表展示VO类
 * @author: jie.pang
 * @create: 2018-07-31 11:55
 **/
@Setter
@Getter
@ToString
@ApiModel("用户列表结果集")
public class PosUserListVO {






    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("真实姓名")
    private String realName;
    @ApiModelProperty("登陆名称")
    private String userName;
    @ApiModelProperty("员工号")
    private String employeeNum;
    @ApiModelProperty("手机号")
    private String mobile;
    @ApiModelProperty("状态")
    private Byte state;
    @ApiModelProperty("状态转义")
    private String stateCode;
    @ApiModelProperty("用户权限")
    private List<PosRightVO> rights;

}
