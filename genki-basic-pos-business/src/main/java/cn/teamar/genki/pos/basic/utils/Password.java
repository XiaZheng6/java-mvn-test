package cn.teamar.genki.pos.basic.utils;

import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.basic.common.utils.Assert;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;


@Slf4j
public class Password {

    private static final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public static String encode(String password) {
        return md5Encode(password.getBytes(StandardCharsets.UTF_8));
    }

    public static boolean match(String inputPassword, String encodedPassword) {
        if (encodedPassword == null) return inputPassword == null;
        return encodedPassword.equals(encode(inputPassword));
    }

    public static void validate(String inputPassword, String encodedPassword) {
        Assert.state(match(inputPassword, encodedPassword), ErrorsEnum.INCORRECT_PASSWORD);
    }

    public static String md5Encode(byte[] data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(data);
            return byteToHex(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String byteToHex(byte[] bytes) {
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }

}
