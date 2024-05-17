package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Account;

import java.util.List;


public interface IAccountService {

    List<Account> findAll();
    Account doesUserExist(String username, String password);
    Account createAccount(Account account);
    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
    Account findById(Long id);
    Account getAccount(Long id);
}