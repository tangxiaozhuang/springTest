package com.gduf.spring_annot;

import com.sun.xml.internal.ws.api.PropertySet;
import org.springframework.stereotype.Repository;

/**
 * Created by thz on 2017/5/24.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("BookDaoImpl（）方法实现");
    }
}
