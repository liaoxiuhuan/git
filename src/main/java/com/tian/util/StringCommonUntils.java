package com.tian.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc: 字符串处理工具类
 * @ProjectName: xmlw_crawler
 * @Date: 2018/6/8 17:14
 * @Author: caowj
 */
public class StringCommonUntils {

    private static Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");

    public static double filterChar(String content) {
        //匹配任何不在0~9范围内的字符
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(content);
        double parseDouble = Double.parseDouble(m.replaceAll(""));
        return parseDouble;
    }

    public static String htmlFilter(String originStr) {
        //去除字符串中的空格\\s*,回车\n,换行符\r,制表符\t
        Matcher matcher = pattern.matcher(originStr);
        return matcher.replaceAll("");
    }

    public static String filterSingleQuotes(String originStr) {
        return originStr.replaceAll("'", "’");
    }

    public static String filterBr(String originStr) {
        return originStr.replaceAll("<br>", " ");
    }

    /**
     * 把string[]格式转为'','',''格式
     */
    public static String filterStrArrToStr(String... sellerCodes) {
        if (sellerCodes.length == 0) {
            return null;
        }
        StringBuilder poiIds = new StringBuilder("'");
        for (String sellerCode : sellerCodes) {
            poiIds.append(sellerCode).append("','");
        }
        return poiIds.substring(0, (poiIds.length() - 2));
    }

    /**
     * 参考：©https://zhuanlan.zhihu.com/p/26726273
     */
    public static String filterOffUtf8Mb4(String text) {
        try {
            byte[] bytes = text.getBytes("utf-8");
            ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
            int i = 0;
            while (i < bytes.length) {
                short b = bytes[i];
                if (b > 0) {
                    buffer.put(bytes[i++]);
                    continue;
                }
                //去掉符号位
                b += 256;
                if (((b >> 5) ^ 0x06) == 0) {
                    buffer.put(bytes, i, 2);
                    i += 2;
                } else if (((b >> 4) ^ 0x0E) == 0) {
                    buffer.put(bytes, i, 3);
                    i += 3;
                } else if (((b >> 3) ^ 0x1E) == 0) {
                    i += 4;
                } else if (((b >> 2) ^ 0xBE) == 0) {
                    i += 5;
                } else {
                    i += 6;
                }
            }
            buffer.flip();
            text = new String(buffer.array(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return text;
    }

}
