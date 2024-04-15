package com.eda.bankingapp.service.impl;

import com.eda.bankingapp.dto.AccountDto;
import com.eda.bankingapp.entity.Account;
import com.eda.bankingapp.mapper.AccountMapper;
import com.eda.bankingapp.repository.AccountRepository;
import com.eda.bankingapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
