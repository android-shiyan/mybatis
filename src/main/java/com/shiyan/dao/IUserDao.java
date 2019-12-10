package com.shiyan.dao;

import com.shiyan.domain.QueryVo;
import com.shiyan.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);

    User findById(Integer userId);

    List<User> findByName(String username);

    //查询总用户数
    int findTotal();

    List<User> findUserByVo(QueryVo vo);

    List<User> findByUser(User user);

    List<User> findInIds(QueryVo vo);
}
