package com.hjy.aop.dao;

public class UserDaoImpl implements UserDao {
    public void addUser(){
        System.out.println("addUser添加了用户。");
    }
    public void delUser(){
        System.out.println("delUser删除了用户。");
    }
}
