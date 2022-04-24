package com.flzj.admin.controller;


import com.flzj.admin.bean.Account;
import com.flzj.admin.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class SelectAccountTestController {

    @Autowired
    AccountService accountService;

    @GetMapping("/acct")
    @ResponseBody
    public Account getById(@RequestParam("id") Long id){
        return accountService.getAcctById(id);
    }


}
