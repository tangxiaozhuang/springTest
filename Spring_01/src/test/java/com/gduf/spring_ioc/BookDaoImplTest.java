package com.gduf.spring_ioc;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by thz on 2017/5/24.
 */
public class BookDaoImplTest {
    @org.junit.Test
    public void addUser() throws Exception {
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.addUser();
    }

}