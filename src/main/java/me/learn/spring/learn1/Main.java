package me.learn.spring.learn1;

import lombok.extern.log4j.Log4j;
import me.learn.spring.learn1.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Log4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Student s = context.getBean(Student.class);
        log.info(s);
    }
}
