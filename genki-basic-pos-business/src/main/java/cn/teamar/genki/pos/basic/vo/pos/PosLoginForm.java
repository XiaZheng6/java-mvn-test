package cn.teamar.genki.pos.basic.vo.pos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @program: genki-basic-pos
 * @description: POS登录Form
 * @author: jie.pang
 * @create: 2018-08-14 18:49
 **/
@Setter
@Getter
@ToString
@ApiModel
public class PosLoginForm {

    @NotBlank
    @ApiModelProperty("用户名")
    private String userName;
    @NotBlank
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("MAC地址")
    private String macAddress;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("登录类型")
    private String loginType;
}
