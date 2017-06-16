package com.gduf.spring_aop_auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thz on 2017/6/6.
 */
public class AopTest {
    public static void main(String[] args){
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService= (BookService) applicationContext.getBean("bookService");
        bookService.addBook();
        bookService.deleteBook();
        bookService.updateBook();
    }
}
