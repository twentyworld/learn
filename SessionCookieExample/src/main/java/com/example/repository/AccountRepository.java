package com.example.repository;

import com.example.entity.Account;
        import org.springframework.data.repository.Repository;

        import java.util.List;

/**
 * Created by teemper on 2017/9/15, 19:33.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
public interface AccountRepository extends Repository<Account,Integer> {
    Account save(Account account);
    Account findById(int id);
    List<Account> findAll();
    Account findByName(String name);
}
