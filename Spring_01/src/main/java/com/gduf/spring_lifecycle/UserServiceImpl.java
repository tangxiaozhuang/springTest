package com.gduf.spring_lifecycle;

/**
 * Created by thz on 2017/5/24.
 */
public class UserServiceImpl implements UserService {
    public void init(){
        System.out.println("初始化方法实现");
    }

    public void addUser() {
        System.out.println("addUser（）方法实现");
    }

    public void destroy(){
        System.out.println("销毁方法实现");
    }
}
