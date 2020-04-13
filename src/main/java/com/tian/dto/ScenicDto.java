package com.tian.dto;

import com.tian.entity.Scenic;

import java.util.List;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc:
 * @ProjectName: crawler-bi
 * @Date: 2018/7/5 16:05
 * @Author: caowj
 */
public class ScenicDto {
    /**
     * 总条数
     */
    private String count;
    /**
     * 页数
     */
    private String pageNum;
    private List<Scenic> scenic;

    public String getCount() {
        return count;
    }

    public ScenicDto setCount(String count) {
        this.count = count;
        return this;
    }

    public String getPageNum() {
        return pageNum;
    }

    public ScenicDto setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public List<Scenic> getScenic() {
        return scenic;
    }

    public ScenicDto setScenic(List<Scenic> scenic) {
        this.scenic = scenic;
        return this;
    }

    @Override
    public String toString() {
        return "ScenicDto{" +
                "count='" + count + '\'' +
                ", pageNum='" + pageNum + '\'' +
                ", scenic=" + scenic +
                '}';
    }
}
