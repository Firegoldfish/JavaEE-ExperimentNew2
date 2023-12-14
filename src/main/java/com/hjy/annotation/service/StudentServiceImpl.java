package com.hjy.annotation.service;
import com.hjy.annotation.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{
    @Resource(name = "StudentDao")
    StudentDao studentDao;
    public void save(){
        this.studentDao.save();
        System.out.println("Service已保存。");
    }
}
