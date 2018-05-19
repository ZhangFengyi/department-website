package com.baohao.departmentwebsite.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String format(Long millis) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        long time = System.currentTimeMillis();
        Date date = new Date();
        date.setTime(time);
        String formatDate = simpleDateFormat.format(date);
//        System.out.println(formatDate);
        return formatDate;
    }
}
