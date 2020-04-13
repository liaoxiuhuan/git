package com.tian.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc:
 * @ProjectName: xmlw_crawler
 * @Date: 2018/6/8 17:28
 * @Author: caowj
 */
public abstract class ElementUtils {

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 区域
     */
    public static final Map<String, String> mapArea = new HashMap();
    /**
     * 分类
     */
    public static final Map<String, String> map = new HashMap();

    /**
     * 获取区域信息
     */
    public static Map getAreaInfo() {
        mapArea.put("8697", "中山路-步行街");
        mapArea.put("144", "曾厝垵");
        mapArea.put("8713", "轮渡码头区");
        mapArea.put("7578", "环岛路");
        mapArea.put("145", "鼓浪屿");
        mapArea.put("148", "厦门大学附近");
        mapArea.put("146", "白鹭洲风景区");
        mapArea.put("147", "湖里区");
        mapArea.put("142", "集美区");
        mapArea.put("2429", "海沧区");
        return mapArea;
    }

    /**
     * 餐饮分类信息
     */
    public static Map getEatingClassificationInfo() {
        map.put("9472", "快餐");
        map.put("7654", "川菜");
        map.put("7558", "酒吧");
        map.put("16089", "连锁/加盟");
        map.put("16088", "主题");
        map.put("16090", "外卖/窗口");
        map.put("8811", "贵州菜");
        map.put("35399", "下午茶");
        map.put("39238", "摊位");
        map.put("36817", "早午餐");
        map.put("39590", "特色");
        map.put("7655", "湘菜");
        map.put("7923", "江浙菜");
        map.put("15965", "粤菜");
        map.put("15966", "新疆菜");
        map.put("16116", "港式");
        map.put("20340", "西餐");
        map.put("7529", "日本料理");
        map.put("7660", "韩国料理");
        map.put("15968", "东南亚美食");
        map.put("7523", "海鲜");
        map.put("7533", "火锅");
        map.put("7535", "小吃");
        map.put("7664", "烧烤");
        map.put("7665", "粥店面食");
        map.put("35177", "咖啡饮品");
        return map;
    }
}