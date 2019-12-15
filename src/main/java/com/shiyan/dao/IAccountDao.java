package com.shiyan.dao;

import com.shiyan.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();
}
