package cn.teamar.genki.pos.basic.utils;

import java.text.DecimalFormat;


public class MoneyUtils {

    private static final String FMT = "#.00";

    public static final int FEN_UNIT = 100;

    public static DecimalFormat df = new DecimalFormat("######0.00");

    public static String centToDisplay(long cent) {
        DecimalFormat df = new DecimalFormat(FMT);
        return df.format(cent);
    }

    public static String fen2yuan(Long fen) {
        if (fen == null) {
            return "0";
        }
        double result = (double) fen / FEN_UNIT;
        return df.format(result);
    }

}
