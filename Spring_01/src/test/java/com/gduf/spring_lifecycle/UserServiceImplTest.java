package com.gduf.spring_lifecycle;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by thz on 2017/5/26.
 */
public class UserServiceImplTest {
    @Test
    public void addUser() throws Exception {
        String xmlPath="applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService=applicationContext.getBean("userService4",UserService.class);
        userService.addUser();
        //1：关闭容器    2：对象必须是单例
        applicationContext.close();
    }

}