package com.lianxi.ssm.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;


public class DateUtils {

    //日期转换成字符串
    public static String dataToString(Date date, String strr){
        SimpleDateFormat sf = new SimpleDateFormat(strr);
        String dstrr = sf.format(date);
        return dstrr;
    }

    //字符串转换为日期
    public static Date stringToData(Date date, String strr) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(strr);
        Date ddate = sf.parse(strr);
        return ddate;
    }
}
