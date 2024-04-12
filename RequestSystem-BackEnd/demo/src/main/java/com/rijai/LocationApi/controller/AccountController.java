package com.rijai.LocationApi.controller;

import com.rijai.LocationApi.model.Account;
import com.rijai.LocationApi.service.IAccountService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class AccountController {
    @Autowired
    private IAccountService accountService;


    @GetMapping("/api/users/{username}/{password}")
    public Account requestAccount(@PathVariable Map<String, String> pathVarsMap) {
        return accountService.doesUserExist(pathVarsMap.get("username"), pathVarsMap.get("password"));
    }

    @PostMapping("/api/create-account")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/api/show-account/{id}")
    public Account showAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @PutMapping("/api/update-account/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
        return accountService.updateAccount(id, account);
    }
    @DeleteMapping("/api/delete-account/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }

}
