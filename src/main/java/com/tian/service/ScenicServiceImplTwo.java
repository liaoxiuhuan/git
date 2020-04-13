package com.tian.service;

import com.tian.dto.ScenicDto;
import com.tian.entity.Scenic;
import com.tian.repository.ScenicRepository;
import com.tian.repository.ScenicRepositoryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Copyright:Zhejiang DRORE Technology
 * @Desc:
 * @ProjectName: crawler-bi
 * @Date: 2018/7/3 11:34
 * @Author: caowj
 */

@Service
public class ScenicServiceImplTwo {
    @Autowired
    ScenicRepositoryTwo scenicRepository;

    public ScenicDto getScenics(String type, int currentPage, int pageSize) {
        Page<Scenic> pageInfo = this.scenicRepository.findAll(new PageRequest(currentPage - 1, pageSize));
        List<Scenic> content = pageInfo.getContent();
        ScenicDto dto = new ScenicDto();
        dto.setScenic(content);
        String s1 = String.valueOf(pageInfo.getTotalElements());
        String s = String.valueOf(pageInfo.getTotalPages());
        dto.setCount(s1);
        dto.setPageNum(s);
        return dto;
    }
}


