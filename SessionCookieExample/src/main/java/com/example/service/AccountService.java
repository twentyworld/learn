package com.example.service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teemper on 2017/9/15, 19:36.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Service
public class AccountService {
    private AccountRepository repository;
    @Autowired
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }
    public Account getAccountById(int id){
        return repository.findById(id);
    }
    public Account save(Account account){
        return repository.save(account);
    }
    public List<Account> getAll(){
        return repository.findAll();
    }
    public boolean isUserDefined(Account account){
        return account.getId() == 11|| account.getId()==22;
    }
    public Account getAccountByName(String name){
        return repository.findByName(name);
    }
}
