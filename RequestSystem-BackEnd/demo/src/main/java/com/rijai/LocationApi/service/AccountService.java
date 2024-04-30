package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Account;
import com.rijai.LocationApi.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @PersistenceContext
    private EntityManager em;

    public Account doesUserExist(String username, String password) {
        TypedQuery<Account> query = em.createQuery("SELECT u FROM Account u WHERE u.username = :username AND u.password = :password", Account.class);
        query.setParameter("username", username);
        query.setParameter("password", password);

        try {
            return query.getSingleResult();
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
