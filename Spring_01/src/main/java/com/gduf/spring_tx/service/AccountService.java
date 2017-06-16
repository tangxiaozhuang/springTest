package com.gduf.spring_tx.service;

/**
 * Created by thz on 2017/6/15.
 */
public interface AccountService {
    public void transfer(String inner,String outer,int money);
}
