package me.learn.spring.learn1.controller;

import me.learn.spring.learn1.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oneday on 2016/7/21 0021.
 */
@RestController
@RequestMapping("/learn1")
public class Learn1Controller {
    @Autowired
    private Student student;

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public Student getStudent(){
        return student;
    }

}
