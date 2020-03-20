package cn.teamar.genki.pos.basic.utils;

import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.common.tools.exception.BusinessException;
import cn.teamar.genki.common.tools.exception.ErrorType;
import cn.teamar.genki.common.tools.response.Response;
import cn.teamar.genki.common.tools.utils.Assert;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;


/**
 * @author 庞杰(jie.pang)
 * @since 2018-05-30 下午4:40
 **/
@Slf4j
public class Utils {

    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) return n1 == null && n2 == null;
        return n1.intValue() == n2.intValue();
    }

    public static boolean equals(Long n1, Long n2) {
        if (n1 == null || n2 == null) return n1 == null && n2 == null;
        return n1.longValue() == n2.longValue();
    }

    public static boolean equals(Number n1, Number n2) {
        if (n1 == null || n2 == null) return n1 == null && n2 == null;
        return n1.equals(n2);
    }

    public static boolean available(Number n) {
        return n != null && n.intValue() > 0;
    }

    public static void validRpc(Response response, String appName) {
        ErrorType type_ = null;
        if (response == null) {
            // should not null(FeignImpl)
            type_ = ErrorType.SYSTEM_ERROR;
        } else if (!response.isSuccess()) {
            type_ = ErrorsEnum.CALL_DOWNSTREAM_FAILED.params(appName, response.getCode() + ":" + response.getMsg());
        }
        if (type_ != null) {
            throw new BusinessException(type_);
        }
    }

    public static void validRpc(Response response, String appName, ErrorType ifNull) {
        validRpc(response, appName);
        Assert.notNull(response.getData(),
                Optional.ofNullable(ifNull)
                        .orElse(ErrorsEnum.CALL_DOWNSTREAM_FAILED.params(appName, "结果为空")));
    }

    public static void validRpc(Response response, String appName, String ifNull) {
        Assert.notNull(response.getData(), ErrorsEnum.CALL_DOWNSTREAM_FAILED.params(appName, ifNull));
    }

    public static String safeTrim(String val) {
        if (val == null) return null;
        return val.trim();
    }

    public static boolean textEquals(String v1, String v2) {
        if (v1 == null || v2 == null) return v1 == null && v2 == null;
        return v1.trim().equalsIgnoreCase(v2.trim());
    }

}
