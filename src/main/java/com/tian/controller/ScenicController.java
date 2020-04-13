package com.tian.controller;

import com.tian.dto.ScenicDto;
import com.tian.service.ScenicServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc:
 * @ProjectName: crawler-bi
 * @Date: 2018/7/3 11:12
 * @Author: caowj
 */

@Controller
//@EnableAutoConfiguration
@RequestMapping("/scenic")
public class ScenicController {
    @Resource
    ScenicServiceImpl scenicImpl;
    @RequestMapping("/query")
    @ResponseBody
    public ScenicDto queryList(@RequestParam("webSite")String webSite, @RequestParam("city")String city,
                               @RequestParam(required = false,name = "currentPage",defaultValue = "1")String currentPage,
                               @RequestParam(required = false,name = "pageSize",defaultValue = "10")String pageSize) {
        return scenicImpl.getScenic(webSite,city,currentPage,pageSize);
    }
}
