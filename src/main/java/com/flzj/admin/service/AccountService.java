package com.flzj.admin.service;

import com.flzj.admin.bean.Account;
import com.flzj.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAcctById(Long id){
        return accountMapper.getAcct(id);
    }


}
