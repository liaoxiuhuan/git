//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tian.service;

import com.tian.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User var1);

    User updateUser(User var1);

    User deleteUser(int var1);

    User findOne(int var1);

    List<User> getUsers();
}
