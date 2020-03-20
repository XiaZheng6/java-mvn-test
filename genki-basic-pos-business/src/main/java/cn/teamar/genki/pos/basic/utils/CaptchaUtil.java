package cn.teamar.genki.pos.basic.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @program: genki-basic
 * @description: 验证码工具类
 * @author: jie.pang
 * @create: 2018-07-30 15:28
 **/
public class CaptchaUtil {
    private static final char[] GRAPHICS_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final int FONT_STYLE = Font.BOLD;
    private static final int FONT_SIZE = 26;
    private static final Font[] FONTS = {
            new Font("宋体", FONT_STYLE, FONT_SIZE),
            new Font("新宋体", FONT_STYLE, FONT_SIZE),
            new Font("黑体", FONT_STYLE, FONT_SIZE),
            new Font("楷体", FONT_STYLE, FONT_SIZE),
            new Font("隶书", FONT_STYLE, FONT_SIZE),};
    private static final int DEFAULT_GRAPHICS_PADDING_LEFT = 5;
    private static final int DEFAULT_GRAPHICS_PADDING_TOP = 19;
    private static final int DEFAULT_GRAPHICS_CHAR_WIDTH = 15;
    private static final int DEFAULT_GRAPHICS_DELTA_PADDING_TOP = 8;
    private static final int DEFAULT_GRAPHICS_HEIGHT = 30;
    private static final int DEFAULT_GRAPHICS_WIDTH = 80;
    private static final int DEFAULT_CAPTCHA_LINES = 10;
    public static final int DEFAULT_GRAPHICS_CAPTCHA_LENGTH = 4;
    public static final int DEFAULT_MESSAGE_CAPTCHA_LENGTH = 6;

    public static String randomGraphicsCaptcha() {
        StringBuilder sb = new StringBuilder();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < DEFAULT_GRAPHICS_CAPTCHA_LENGTH; i++) {
            sb.append(GRAPHICS_CHARS[random.nextInt(GRAPHICS_CHARS.length)]);
        }
        return sb.toString();
    }

    public static String randomMessageCaptcha() {
        StringBuilder sb = new StringBuilder();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < DEFAULT_MESSAGE_CAPTCHA_LENGTH; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public static Color getRandomColor(int start, int end) {
        start = Math.min(start, 255);
        end = Math.min(end, 255);
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new Color(
                random.nextInt(start, end),
                random.nextInt(start, end),
                random.nextInt(start, end));
    }

    public static void paintCaptchaChars(Graphics g, String captcha) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < captcha.length(); i++) {
            g.setColor(getRandomColor(50, 150));
            g.setFont(FONTS[random.nextInt(FONTS.length)]);
            int x = DEFAULT_GRAPHICS_CHAR_WIDTH * i + DEFAULT_GRAPHICS_PADDING_LEFT;
            int y = DEFAULT_GRAPHICS_PADDING_TOP + random.nextInt(DEFAULT_GRAPHICS_DELTA_PADDING_TOP);
            g.drawString(String.valueOf(captcha.charAt(i)), x, y);
        }
    }

    public static void paintCaptchaBackground(Graphics g) {
        g.setColor(getRandomColor(220, 250));
        g.fillRect(0, 0, DEFAULT_GRAPHICS_WIDTH, DEFAULT_GRAPHICS_HEIGHT);
        for (int i = 0; i < DEFAULT_CAPTCHA_LINES; i++) {
            g.setColor(getRandomColor(40, 150));
            Random random = new Random();
            int x = random.nextInt(DEFAULT_GRAPHICS_WIDTH);
            int y = random.nextInt(DEFAULT_GRAPHICS_HEIGHT);
            int x1 = random.nextInt(DEFAULT_GRAPHICS_WIDTH);
            int y1 = random.nextInt(DEFAULT_GRAPHICS_HEIGHT);
            g.drawLine(x, y, x1, y1);
        }
    }

    public static String generateCaptcha(OutputStream out) throws IOException {
        String captcha = randomGraphicsCaptcha();
        BufferedImage image =
                new BufferedImage(DEFAULT_GRAPHICS_WIDTH, DEFAULT_GRAPHICS_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        paintCaptchaBackground(g);
        paintCaptchaChars(g, captcha);
        g.dispose();
        ImageIO.write(image, "JPEG", out);
        return captcha;
    }
}
