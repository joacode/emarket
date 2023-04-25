package com.emarket.accounts;

import com.emarket.accounts.domain.Account;
import com.emarket.accounts.domain.AccountInsertRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountsMapper {

    List<Account> find();

    void insert(AccountInsertRequest params);

    void update(Long id, AccountInsertRequest params);

    void delete(Long id);
}
