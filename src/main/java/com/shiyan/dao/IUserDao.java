package com.shiyan.dao;

import com.shiyan.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);
}
