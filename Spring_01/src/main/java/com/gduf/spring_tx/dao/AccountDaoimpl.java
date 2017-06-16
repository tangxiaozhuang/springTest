package com.gduf.spring_tx.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by thz on 2017/6/15.
 */
public class AccountDaoimpl extends JdbcDaoSupport implements AccountDao {
    public void in(String inner, int money) {
        String sql="update account_table set money=money+? where username=?";
        this.getJdbcTemplate().update(sql,money,inner);
    }

    public void out(String outer, int money) {
        String sql="update account_table set money=money-? where username=?";
        this.getJdbcTemplate().update(sql,money,outer);
    }
}
