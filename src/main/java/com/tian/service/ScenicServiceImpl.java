package com.tian.service;

import com.tian.dto.ScenicDto;
import com.tian.entity.Scenic;
import com.tian.repository.ScenicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc:
 * @ProjectName: crawler-bi
 * @Date: 2018/7/3 11:34
 * @Author: caowj
 */

@Service
public class ScenicServiceImpl {
    //@Autowired
    ScenicRepository scenicRepository;

    public ScenicDto getScenic(String webSite, String city, String currentPage, String pageSize) {
        ScenicDto scenicDto = new ScenicDto();
        Pageable pageable = new PageRequest(Integer.parseInt(currentPage) - 1, Integer.parseInt(pageSize));
        Page<Scenic> page;
        List<Scenic> scenic2 = null;
        //int count = 0;
        /*if ("all".equals(webSite)) {
            page = scenicRepository.getScenicAll(city, pageable);
            scenic2 = scenicRepository.findByCity(city);
            System.out.println("====size" + page.getSize());
            System.out.println("====number" + page.getNumber());
            System.out.println(scenic2.size()+"222.ssi");
        } else {
            page = scenicRepository.getScenic(webSite, city, pageable);
            scenic2 = scenicRepository.getByWebSiteAndCity(webSite, city);
        }*/
        //List<Scenic> content = page.getContent();
        List<Scenic> content = null;
        int size = scenic2.size();
        scenicDto.setPageNum(String.valueOf((size + Integer.parseInt(pageSize) - 1) / Integer.parseInt(pageSize)));
        scenicDto.setCount(String.valueOf(size));
        scenicDto.setScenic(content);
        System.out.println(scenicDto);
        return scenicDto;
    }

}


