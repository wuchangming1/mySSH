package test;

import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * Created by Administrator on 2018/11/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
    @Autowired
    public UserService userService;
    @Test
    public void demo(){
        User user = new User();
        user.setAge(11);
        user.setUserName("jack");
        user.setPassword("111221");
        userService.register(user);

    }

}
