package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

    /***
     * 查询所有
     * @return
     */
    List<User> findAll();


    int findone(User user);
}
