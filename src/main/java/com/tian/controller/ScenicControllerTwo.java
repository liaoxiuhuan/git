//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tian.controller;

import com.tian.dto.ScenicDto;
import com.tian.service.ScenicServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;

import com.tian.service.ScenicServiceImplTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/vuetian"})
public class ScenicControllerTwo {
    @Autowired
    ScenicServiceImplTwo scenicServiceImpl;

    public ScenicControllerTwo() {
    }

    @GetMapping({"/{type}/select"})
    public ScenicDto queryScenic(@PathVariable String type, @RequestParam(value = "currentPage",required = false,defaultValue = "1") int currentPage, @RequestParam(value = "pageSize",required = false,defaultValue = "10") int pageSize) {
        return this.scenicServiceImpl.getScenics(type, currentPage, pageSize);
    }

    @GetMapping({"/classify"})
    public Map queryMasterClassify() {
        Map<String, String> map = new LinkedHashMap();
        map.put("scenic", "景点");
        map.put("eating", "美食");
        map.put("hotel", "住宿");
        map.put("shopping", "商圈");
        map.put("amusement", "休闲演绎");
        return map;
    }

    @GetMapping({"/{type}/classification"})
    public Map queryScenicCla(@PathVariable String type) {
        Map<String, String> map = new LinkedHashMap();
        map.put("scenic", "自然风光");
        map.put("eating", "时尚地标");
        map.put("hotel", "城市公园");
        map.put("shopping", "其他");
        return map;
    }

    @GetMapping({"/{type}/validate/{poi}/{validate}"})
    public String updateScenicValidate(@PathVariable String type, @PathVariable String poi, @PathVariable String validate) {
        return null;
    }

    @GetMapping({"/{type}/validateBatch/{poi}/{validate}"})
    public String updateScenicValidates(@PathVariable String type, @PathVariable String poi, @PathVariable String validate) {
        return null;
    }

    @GetMapping({"/{type}/classify"})
    public String querySlaveDetail(@PathVariable String type) {
        return null;
    }

    @PostMapping({"/{id}/updateCrawlerRule"})
    public String updateSlaveDetail(@PathVariable String id) {
        return null;
    }
}
