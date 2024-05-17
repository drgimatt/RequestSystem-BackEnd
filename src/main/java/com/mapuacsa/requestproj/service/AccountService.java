package com.mapuacsa.requestproj.service;

import com.mapuacsa.requestproj.model.Account;
import com.mapuacsa.requestproj.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @PersistenceContext
    private EntityManager em;

    public Account doesUserExist(String username, String password) {
        TypedQuery<Account> query = em.createQuery(
            "SELECT u FROM Account u WHERE u.username = :username",
            Account.class
        );
        query.setParameter("username", username);
    
        try {
            Account user = query.getSingleResult();
            // Perform a case-sensitive comparison of passwords
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                return null;
            }
        } catch (NoResultException e) {
            return null;
        }
    }
    

    public List<Account> findAll() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        Optional<Account> optional=accountRepository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Account) optional.get();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, Account account) {
        return accountRepository.save(account);
    }

    public Account findById(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        return account.orElse(null);
    }

    public void deleteAccount (Long id) {
        Optional<Account> account = accountRepository.findById(id);
        account.ifPresent(value -> accountRepository.delete(value));
    }
}
