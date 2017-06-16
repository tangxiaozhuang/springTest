package com.gduf.spring_tx.action;

import com.gduf.spring_tx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thz on 2017/6/15.
 */
public class TestAction
{
    @Test
public void testAcc(){
    String xmlPath="applicationContext.xml";
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
    AccountService accountService=(AccountService)applicationContext.getBean("accountService");
    accountService.transfer("tom","jack",1000);
}
}
