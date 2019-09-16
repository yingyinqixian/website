package com.yingyinqi.website.service;

import com.yingyinqi.website.bean.User;

import java.util.List;

public interface UserService {

    void insert(User user);

    void update(User user);

    void delete(Long id);

    User get(Long id);

    List<User> list();
}