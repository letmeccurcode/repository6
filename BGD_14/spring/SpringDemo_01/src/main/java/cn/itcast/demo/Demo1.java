package cn.itcast.demo;

import cn.itcast.dao.Userdao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Userdao userDao = (Userdao) app.getBean("userDao");
        userDao.save();
    }
}
