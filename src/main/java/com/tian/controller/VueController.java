package com.tian.controller;

import com.tian.entity.Scenic;
import com.tian.service.ScenicServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/vue")
public class VueController {
    @Resource
    ScenicServiceImpl scenicImpl;
    @RequestMapping("/getScenic")
    @ResponseBody
    public Object queryList() {
        Scenic scenic = new Scenic();
        scenic.setName("vue这么有魅力吗");
        return scenic;
    }
}
