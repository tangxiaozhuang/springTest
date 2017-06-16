package com.gduf.spring_tx.service;

import com.gduf.spring_tx.dao.AccountDao;

/**
 * Created by thz on 2017/6/15.
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public void transfer(String inner, String outer, int money) {
        accountDao.in(inner,money);
        accountDao.out(outer,money);
    }
}
