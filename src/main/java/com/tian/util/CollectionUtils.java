package com.tian.util;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc: 马蜂窝相关业务处理工具类
 * @ProjectName: xmlw_crawler
 * @Date: 2018/6/8 17:41
 * @Author: caowj
 */
public class CollectionUtils {

    /**
     * list去重，不改变顺序 - web获取到的数据进行第一次去重
     */
    public static <T> List filterList(List<T> list) {
        LinkedHashSet<T> set = new LinkedHashSet(list.size());
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    /**
     * 为list中元素设置id
     *
     * @param lists
     * @param <T>
     */
    public static <T> void setId(List<T> lists) {
        for (T list : lists) {
            UUID uuid = UUID.randomUUID();
            try {
                Class<?> clazz = list.getClass();
                Method method = clazz.getMethod("setId", String.class);
                method.invoke(list, uuid.toString().replaceAll("-", ""));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
