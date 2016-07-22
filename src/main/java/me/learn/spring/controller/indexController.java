package me.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oneday on 2016/7/21 0021.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
