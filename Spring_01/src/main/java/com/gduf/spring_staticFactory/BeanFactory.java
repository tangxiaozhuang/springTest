package com.gduf.spring_staticFactory;


/**
 * Created by thz on 2017/5/25.
 */
public class BeanFactory {
 /*  //这是一个静态工厂
    public static UserService creatUserService(){
        return new UserServiceImpl();
    }*/
    public UserService creatUserService(){
      return new UserServiceImpl();
    }

}
