package com.gduf.spring_annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by thz on 2017/5/25.
 */
@Service
public class BookSeviceImpl implements BookService {
    private BookDao bookDao;

    @Autowired
    @Qualifier("bookDao")
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook() {
        System.out.print("BookServiceImpl方法实现了");
        bookDao.save();
    }


}
