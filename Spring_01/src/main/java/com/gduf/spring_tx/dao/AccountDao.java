package com.gduf.spring_tx.dao;

/**
 * Created by thz on 2017/6/15.
 */
public interface AccountDao
{
    public void in(String inner,int monney);
    public void out(String outer,int monney);
}
