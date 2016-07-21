package me.learn.spring.learn1;

import me.learn.spring.learn1.bean.ClassRoom;
import me.learn.spring.learn1.bean.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by oneday on 2016/7/13 0013.
 */
@Configuration
@PropertySource("classpath:me/app.properties")
public class Configurations {
    @Value("${classroom.name}")
    private String c1;

    @Bean @Profile("dev")
    public Student student(){
        return new Student("dev->s1");
    }

    @Bean @Profile("product")
    public Student student2(){
        return new Student("product->s1");
    }
    @Bean
    public ClassRoom classRoom(){

        return new ClassRoom(c1);
    }
}
