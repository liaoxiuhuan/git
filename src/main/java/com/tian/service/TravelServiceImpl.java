package com.tian.service;

import org.springframework.stereotype.Service;

/**
 * @ Copyright:Zhejiang DRORE Technology
 * @ Desc:
 * @ ProjectName: crawler_gather
 * @ Date: 2018/8/17 16:02
 * @ Author: caowj
 */
@Service
public class TravelServiceImpl {
    public String travel(String keywords) {
        String url = "http://elastic:changeme@192.168.11.165:9200/crawler2/travel/_search?pretty";
        String requestBody = "{\"query\":{\"multi_match\":{\"query\":\""+keywords+"\",\"type\":\"best_fields\",\"fields\":[\"name\",\"scenicName\",\"content\"],\"tie_breaker\":0.5}}}";
        //String s = ElasticUtils.postElastic(url, requestBody);
        String s = "";
        return s;
    }
}
