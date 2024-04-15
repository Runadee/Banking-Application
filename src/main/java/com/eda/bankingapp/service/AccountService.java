package com.eda.bankingapp.service;

import com.eda.bankingapp.dto.AccountDto;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);


}
