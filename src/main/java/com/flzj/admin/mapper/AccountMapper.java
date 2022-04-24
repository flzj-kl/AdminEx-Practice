package com.flzj.admin.mapper;

import com.flzj.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    public Account getAcct(Long id);
}
