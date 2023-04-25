package com.emarket.accounts;

import com.emarket.accounts.domain.Account;
import com.emarket.accounts.domain.AccountInsertRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/accounts", produces = "application/json; charset=utf-8")
public class AccountsController {
    @Autowired
    private AccountsService accountsService;

    @GetMapping
    public List<Account> find() {
        return this.accountsService.find();
    }

    @PostMapping
    public void insert( @RequestBody AccountInsertRequest request) {
        this.accountsService.insert( request );
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody AccountInsertRequest request) {
        this.accountsService.update( id, request );
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.accountsService.delete(id);
    }
}
