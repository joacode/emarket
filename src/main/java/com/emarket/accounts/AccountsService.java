package com.emarket.accounts;

import com.emarket.accounts.domain.Account;
import com.emarket.accounts.domain.AccountInsertRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsMapper accountsMapper;

    public List<Account> find() {
        return this.accountsMapper.find();
    }

    public void insert(AccountInsertRequest request) {
        this.accountsMapper.insert(request);
    }

    public void update(Long id, AccountInsertRequest request) {
        this.accountsMapper.update(id, request);
    }

    public void delete(Long id) {
        this.accountsMapper.delete(id);
    }
}
