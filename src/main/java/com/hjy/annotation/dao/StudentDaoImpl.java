package com.hjy.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao{
    public void save(){
        System.out.println("StudentDao已保存");
    }
}
