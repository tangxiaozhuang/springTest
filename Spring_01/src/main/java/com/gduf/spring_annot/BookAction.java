package com.gduf.spring_annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by thz on 2017/6/4.
 */
@Controller("bookId")
public class BookAction {
    @Autowired
    private BookService bookService;

    public void execute() {
        bookService.addBook();
    }
}
