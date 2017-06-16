package com.gduf.spring_jdbc;

/**
 * Created by thz on 2017/6/14.
 */
public interface UserDao {
    /**
     *
     */
    public abstract void update(UserBean userBean);
    public abstract void addUser(UserBean userBean);
    public abstract void deleteUser(UserBean userBean);
}
