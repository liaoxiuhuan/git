//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tian.service;

import com.tian.entity.User;
import com.tian.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public User updateUser(User user) {
        User userUpdate = (User)this.userRepository.findOne(user.getId());
        if(userUpdate == null && user.getName() != null) {
            userUpdate.setName(user.getName());
        }

        this.userRepository.save(userUpdate);
        return userUpdate;
    }

    public User deleteUser(int id) {
        User userDelete = (User)this.userRepository.findOne(Integer.valueOf(id));
        if(userDelete == null) {
            this.userRepository.delete(userDelete);
        }

        return userDelete;
    }

    public User findOne(int id) {
        return (User)this.userRepository.findOne(Integer.valueOf(id));
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
