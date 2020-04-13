package com.tian.util;

import java.io.File;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc: 资源
 * @ProjectName: xmlw_crawler
 * @Date: 2018/6/8 10:14
 * @Author: caowj
 */
public class ResourceUtils {
    /**
     * 动态获取path
     */
    public static String getPath() {
        String path = System.getProperty("user.dir");
        String substring = path.substring(0, path.lastIndexOf(File.separator));
        String substring1 = substring.substring(0, substring.lastIndexOf(File.separator));
        String str = substring1 + File.separator + "image";
        return str;
    }
}
