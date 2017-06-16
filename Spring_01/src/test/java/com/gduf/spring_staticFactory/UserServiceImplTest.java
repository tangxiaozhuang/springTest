package com.gduf.spring_staticFactory;

import com.gduf.spring_ioc.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by thz on 2017/5/25.
 */
public class UserServiceImplTest {
    @Test
    public void addUser() throws Exception {
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService1=applicationContext.getBean("userService",UserService.class);
        UserService userService2=applicationContext.getBean("userService",UserService.class);
        userService1.addUser();
        System.out.println(userService1);
        System.out.println(userService2);
    }

}