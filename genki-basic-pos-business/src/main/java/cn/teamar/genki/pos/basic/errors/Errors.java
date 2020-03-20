package cn.teamar.genki.pos.basic.errors;

import cn.teamar.genki.common.tools.exception.ErrorType;
import lombok.AllArgsConstructor;
import lombok.Getter;



@Getter
@AllArgsConstructor
public enum Errors implements ErrorType {

    USER_NOT_EXISTS(2201, "用户不存在"),
    INCORRECT_PASSWORD(2202, "密码错误"),
    DUPLICATE_USERNAME(2203, "用户名或手机号重复"),
    ILLEGAL_USER_TYPE(2204, "用户类型非法"),
    ILLEGAL_CAPTCHA(2205, "验证码错误或已过期"),
    EMPTY_USERNAME(2206, "用户名为空"),
    EMPTY_PASSWORD(2207, "密码为空"),
    EMPTY_CAPTCHA(2208, "验证码为空"),
    MAC_ADDRESS_NOT_MATCHED(2209, "MAC地址不匹配"),
    INCORRECT_MESSAGE(2210, "[%s]错误!"),
    UPDATE_MESSAGE(2211, "[%s]失败!"),
    PRIMARY_MESSAGE(2212, "[%s]用户为主账户，不能修改密码!"),
    ;



    private final int code;
    private final String msg;

}
