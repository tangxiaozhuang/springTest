package com.gduf.spring_aspect_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.AbstractCollection;

/**
 * Created by thz on 2017/6/13.
 */
public class TsetAspectJ {
    @Test
    public void test(){
        String xmlPath="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService= (BookService) applicationContext.getBean("bookservice");
        bookService.addBook();
        bookService.updateBook();
        bookService.deleteBook();
    }
}
