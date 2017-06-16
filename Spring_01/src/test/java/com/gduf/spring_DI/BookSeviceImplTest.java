package com.gduf.spring_DI;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by thz on 2017/5/25.
 */
public class BookSeviceImplTest {
    @Test
    public void addBook() throws Exception {
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService=(BookService) applicationContext.getBean("bookService");
        bookService.addBook();
    }

}