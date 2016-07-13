package me.learn.spring.learn1;

import me.learn.spring.learn1.bean.ClassRoom;
import me.learn.spring.learn1.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Configuration
public class Configurations {
    @Bean
    public Student student(){
        return new Student("s1");
    }
    @Bean
    public ClassRoom classRoom(){
        return new ClassRoom("c1");
    }
}
