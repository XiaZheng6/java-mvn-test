package cn.teamar.genki.pos.basic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @program: genki-basic
 * @description: 时间处理工具类
 * @author: jie.pang
 * @create: 2018-08-02 12:08
 **/

public class TimeUtil {


    public static int getTimeDistance(String beginDate , String endDate , SimpleDateFormat fmt) throws ParseException {

        return 0;
    }

    public static void main(String[] args) throws ParseException{
        System.out.println(getTimeDistance("06:59:59","06:59:58",new SimpleDateFormat("HH:mm:ss")));
    }
}
