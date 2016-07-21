package me.learn.spring.learn1;

import lombok.extern.log4j.Log4j;
import me.learn.spring.learn1.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by oneday on 2016/7/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configurations.class)
@ActiveProfiles("dev")
@Log4j
public class MainTest {
    @Autowired
    Student student;

    @Test
    public void testStudent() throws InterruptedException {
        log.info(student);
        Thread.sleep(20*1000);
    }
}
