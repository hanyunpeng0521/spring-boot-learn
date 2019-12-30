package com.hyp.learn.quartz.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.quartz.utils
 * hyp create at 19-12-29
 **/
public class QuartzCronDateUtils {
    /***
     *  功能描述：日期转换cron表达式时间格式
     * @param date
     * @param dateFormat : e.g:yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String formatDateByPattern(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /***
     * convert Date to cron ,eg.  "14 01 17 22 07 ? 2017"
     * @param date:时间点
     * @return
     */
    public static String getCron(Date date) {
        String dateFormat = "ss mm HH dd MM ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }

}
