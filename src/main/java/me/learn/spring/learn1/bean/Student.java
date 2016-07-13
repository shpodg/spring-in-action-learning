package me.learn.spring.learn1.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Data
public class Student {
    @Autowired
    ClassRoom classRoom;
    private String name;
    public Student(String name) {
        this.name = name;
    }

}
