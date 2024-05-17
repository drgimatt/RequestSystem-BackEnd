package com.mapuacsa.requestproj.controller;

import com.mapuacsa.requestproj.model.Account;
import com.mapuacsa.requestproj.service.IAccountService;

import java.util.List;
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

    @PostMapping("/api/create-account/")
    public Account createAccount(@ModelAttribute Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/api/show-account/{id}")
    public Account showAccount(@ModelAttribute Long id) {
        return accountService.getAccount(id);
    }

    @GetMapping("/api/accounts")
    public List<Account> showAccounts() {
        return accountService.findAll();
    }

    @PutMapping("/api/update-account/{id}")
    public Account updateAccount(@PathVariable Long id, @ModelAttribute Account account) {
        return accountService.updateAccount(id, account);
    }
    @DeleteMapping("/api/delete-account/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }

}
