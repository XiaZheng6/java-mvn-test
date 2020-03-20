package cn.teamar.genki.pos.basic.utils;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * @program: genki-basic
 * @description: 密码加密类
 * @author: jie.pang
 * @create: 2018-07-31 14:43
 **/
public class PassWordUtil {
    private static final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public static String encode(String password) {
        return md5Encode(password.getBytes(StandardCharsets.UTF_8));
    }

    public static boolean match(String inputPassword, String encodedPassword) {
        if (encodedPassword == null) return inputPassword == null;
        return encodedPassword.equals(encode(inputPassword));
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
