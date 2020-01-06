package cn.itcast.test;

import cn.itcast.dao.Userdao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void m1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Userdao userDao1 = (Userdao) app.getBean("userDao");
        Userdao userDao2 = (Userdao) app.getBean("userDao");
        System.out.println(userDao1 == userDao2);

//        app.close();
    }

}
