package com.tian.service;

//import com.tian.repository.NavigationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Copyright:Zhejiang DRORE Technology
 * @ Desc:
 * @ ProjectName: crawler_gather
 * @ Date: 2018/7/27 11:13
 * @ Author: caowj
 */
//@Service
public class NavigationServiceImpl {
    //@Autowired
    //NavigationRepository testRepository;

    //public NavigationDto getNavigationDto(String currentPage, String pageSize) {
    public Object getNavigationDto(String currentPage, String pageSize) {
        /*NavigationDto scenicDto = new NavigationDto();
        Pageable pageable = new PageRequest(Integer.parseInt(currentPage) - 1, Integer.parseInt(pageSize));
        Page<Navigation> page;
        page = testRepository.pageNavigation(pageable);
        List<Navigation> navigations = testRepository.findAll();
        List<Navigation> content = page.getContent();
        int size = navigations.size();
        scenicDto.setPageNum(String.valueOf((size + Integer.parseInt(pageSize) - 1) / Integer.parseInt(pageSize)));
        scenicDto.setCount(String.valueOf(size));
        scenicDto.setScenic(content);*/
        //return scenicDto;
        return null;
    }
}
