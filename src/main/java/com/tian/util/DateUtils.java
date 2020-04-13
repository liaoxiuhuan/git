package com.tian.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ Copyright:Zhejiang DRORE Technology
 * @ Desc:
 * @ ProjectName: crawler_gather
 * @ Date: 2018/7/20 15:11
 * @ Author: caowj
 */
public class DateUtils {

    /**
     * 默认日期格式
     */
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date getCurrentDate() {
        return new Date();
    }
}
