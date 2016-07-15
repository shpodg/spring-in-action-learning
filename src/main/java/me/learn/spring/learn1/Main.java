package me.learn.spring.learn1;

import lombok.extern.log4j.Log4j;
import me.learn.spring.learn1.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Log4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Student s = context.getBean(Student.class);
        log.info(s);
//        Integer a = Integer.valueOf(1);
//        Integer b = new Integer(1);
//        System.out.println(a==b);
    }
    @Test
    public void testString(){
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s2.intern());
    }

    @Test
    public void testChar(){
        char a='中';


    }
    @Test
    public void testList(){
        List a = new ArrayList();
        List<?> b= new ArrayList<>();

    }
    @Test
    public void testInteger(){
        int x = Integer.MAX_VALUE + Integer.MAX_VALUE;

        System.out.println(x>>1);
        System.out.println(x/2);
        System.out.println(x>>>1);
    }
}
