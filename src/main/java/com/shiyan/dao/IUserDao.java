package com.shiyan.dao;

import com.shiyan.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
