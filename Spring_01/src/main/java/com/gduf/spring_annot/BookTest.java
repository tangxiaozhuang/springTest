package com.gduf.spring_annot;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by thz on 2017/6/4.
 */
public class BookTest {
    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookAction bookAction = (BookAction) applicationContext.getBean("bookId");
        bookAction.execute();
    }
}
