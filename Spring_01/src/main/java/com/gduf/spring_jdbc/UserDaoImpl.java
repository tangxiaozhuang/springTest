package com.gduf.spring_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by thz on 2017/6/14.
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public void update(UserBean userBean) {
        String sql="update t_user set username?,password=?,id=?";
        Object[] args={userBean.getUsername(),userBean.getPassword(),userBean.getId()};
        jdbcTemplate.update(sql,args);
    }

    public void addUser(UserBean userBean) {
        String sql="insert into t_user(username,password) values(?,?);";
        Object[] args={userBean.getUsername(),userBean.getPassword()};
        jdbcTemplate.update(sql,args);
    }

    public void deleteUser(UserBean userBean) {
        String sql="delete from t_user where username=?;";
        Object[] args={userBean.getUsername()};
        jdbcTemplate.update(sql,args);
    }
}
