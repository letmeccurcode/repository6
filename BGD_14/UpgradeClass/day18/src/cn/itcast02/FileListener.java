package cn.itcast02;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//HttpSessionListener

//@WebListener
public class FileListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent eve) {
        ServletContext context = eve.getServletContext();
        //读取配置文件中的初始化参数
        String db1path = context.getInitParameter("db1");//WEB-INF/classes/db1.properties
        String db2path = context.getInitParameter("db2");//db2.properties
        String db3path = context.getInitParameter("db3");//WEB-INF/db3.properties

        //获取真实路径
        String db1 = context.getRealPath(db1path);
        String db2 = context.getRealPath(db2path);
        String db3 = context.getRealPath(db3path);

        try {
            Properties p1 = new Properties();
            p1.load(new FileInputStream(db1));

            Properties p2 = new Properties();
            p2.load(new FileInputStream(db2));

            Properties p3 = new Properties();
            p3.load(new FileInputStream(db3));

            String username1 = p1.getProperty("username");
            String password1 = p1.getProperty("password");
            String username2 = p2.getProperty("username");
            String password2 = p2.getProperty("password");
            String username3 = p3.getProperty("username");
            String password3 = p3.getProperty("password");

            System.out.println(username1+":"+password1);
            System.out.println(username2+":"+password2);
            System.out.println(username3+":"+password3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
