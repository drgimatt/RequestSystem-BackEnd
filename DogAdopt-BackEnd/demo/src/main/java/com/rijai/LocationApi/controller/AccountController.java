package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Account;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping(value="/api/create-account", method= RequestMethod.POST)
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping(value = "/api/show-account/{myId}")
    public Account showAccount(@PathVariable Long myId) {
        return accountService.getAccount(myId);
    }

}
