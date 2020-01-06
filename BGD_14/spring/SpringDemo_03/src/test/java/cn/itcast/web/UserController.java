package cn.itcast.web;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    @Test
    public void m1(){
        ClassPathXmlApplicationContext x = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService s = x.getBean(UserService.class);
        x.close();
        s.save();
    }

}
