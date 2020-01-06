package cn.itcast.demo;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    public static void main(String[] args) {
//        UserServiceImpl s = new UserServiceImpl();
//        s.save();

        ClassPathXmlApplicationContext sx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserService s = (UserService) sx.getBean("userService");
        UserService s = sx.getBean(UserService.class);
        s.save();
    }
}
