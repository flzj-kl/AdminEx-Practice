package com.flzj.admin.space20220420;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class Space20220420ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        Integer integer = jdbcTemplate.queryForObject("select count(*) from account_tbl",Integer.class);
        log.info("总记录数:{}",integer);
    }

}
