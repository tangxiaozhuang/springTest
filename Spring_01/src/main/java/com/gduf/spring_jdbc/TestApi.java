package com.gduf.spring_jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by thz on 2017/6/13.
 */
public class TestApi {
    public static void main(String[] args){
//        创建数据源dataSource
            BasicDataSource dataSource = new BasicDataSource();
            try {
                dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                dataSource.setUrl("jdbc:mysql://localhost:3306/spring_table");
                dataSource.setUsername("root");
                dataSource.setPassword("123");
                //创建模板
            }catch (Exception e){
                System.out.println("数据库连接失败----------------------");
            }
        JdbcTemplate jdbcTemplate=new JdbcTemplate();



        jdbcTemplate.setDataSource(dataSource);
        //通过api操作数据库
        jdbcTemplate.update("insert into t_user(username,password) values('rose1','56178');");


            }
}
