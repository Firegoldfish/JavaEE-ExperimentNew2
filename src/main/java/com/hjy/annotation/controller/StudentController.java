package com.hjy.annotation.controller;

import com.hjy.annotation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
    @Autowired
    StudentService studentService;
    public void save(){
        this.studentService.save();
        System.out.println("Controller已保存。");
    }
}
