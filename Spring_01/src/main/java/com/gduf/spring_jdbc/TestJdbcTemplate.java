package com.gduf.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thz on 2017/6/14.
 */
public class TestJdbcTemplate {
    public static void main(String[] args){
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserBean userBean=(UserBean) applicationContext.getBean("userBean");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        userBean.setUsername("hanzhuang");
        userBean.setPassword("123");
        userDao.addUser(userBean);
    }
}
