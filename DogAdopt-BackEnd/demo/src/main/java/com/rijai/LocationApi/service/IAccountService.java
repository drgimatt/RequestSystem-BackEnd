package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Account;
import com.rijai.LocationApi.model.Dog;


public interface IAccountService {

    Account createAccount(Account account);
    Account getAccount(Long myId);
}