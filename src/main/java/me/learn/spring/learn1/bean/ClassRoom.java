package me.learn.spring.learn1.bean;

import lombok.Data;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Data
public class ClassRoom {
    private String name;

    public ClassRoom(String name) {
        this.name = name;
    }
}
