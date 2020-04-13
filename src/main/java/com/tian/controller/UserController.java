//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tian.controller;

import com.tian.entity.User;
import com.tian.service.UserServiceImpl;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/user"})
public class UserController {
    @Resource
    UserServiceImpl userServiceImpl;

    public UserController() {
    }

    @RequestMapping({"/getById"})
    @ResponseBody
    public User getById(@RequestParam(required = false,name = "id",defaultValue = "1") String id) {
        return this.userServiceImpl.findOne(Integer.parseInt(id));
    }
}
