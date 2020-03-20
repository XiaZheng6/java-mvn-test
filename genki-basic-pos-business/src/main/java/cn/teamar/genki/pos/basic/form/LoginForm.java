package cn.teamar.genki.pos.basic.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @program: genki-basic
 * @description: 登陆表单实体
 * @author: jie.pang
 * @create: 2018-07-27 19:26
 **/
@Getter
@Setter
@ApiModel("登录表单")
public class LoginForm {

    @ApiModelProperty("验证码ID")
    @NotBlank
    private String captchaId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String passWord;

    @ApiModelProperty("验证码")
    private String captcha;
}
