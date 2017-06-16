package com.gduf.spring_DI;

/**
 * Created by thz on 2017/5/25.
 */
public class BookSeviceImpl implements BookService {
    BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
    public void addBook() {
        System.out.print("BookServiceImpl方法实现了");
        bookDao.addBook();
    }


}
