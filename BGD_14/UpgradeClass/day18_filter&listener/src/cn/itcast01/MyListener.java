package cn.itcast01;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@WebListener
public class MyListener implements ServletContextListener {

    FileInputStream is1 = null;
    FileInputStream is2 = null;
    FileInputStream is3 = null;

    //ServletContextListener 经典使用场景就是可以在服务器启动时 加载配置文件 读取配置文件中的信息
    //或者是在项目结束之后释放资源
    @Override
    public void contextInitialized(ServletContextEvent s) {
//        System.out.println("context被创建了");
        try {
//            获取ServletContext对象
            ServletContext context = s.getServletContext();
//            ServletContext可以获取web.xml文件中的初始化参数
//            可以根据param-name 获取对应的param-value
            String db1 = context.getInitParameter("db1");
//            根据param-value获取该配置文件在项目中的真实路径
            String realPath1 = context.getRealPath(db1);
            String db2 = context.getInitParameter("db2");
            String realPath2 = context.getRealPath(db2);
            String db3 = context.getInitParameter("db3");
            String realPath3 = context.getRealPath(db3);

//            根据文件的路径创建输入流
            is1 = new FileInputStream(realPath1);
            is2 = new FileInputStream(realPath2);
            is3 = new FileInputStream(realPath3);

//            可以将配置文件的内容读取到properties文件中
            Properties p1 = new Properties();
            p1.load(is1);
            Properties p2 = new Properties();
            p2.load(is2);
            Properties p3 = new Properties();
            p3.load(is3);

//            根据配置文件中定义的key获取指定的value
            String username1 = p1.getProperty("username");
            System.out.println(username1);
            String username2 = p2.getProperty("username");
            System.out.println(username2);
            String username3 = p3.getProperty("username");
            System.out.println(username3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent s) {

        if (is1 != null) {
            try {
                is1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (is2 != null) {
            try {
                is2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (is3 != null) {
            try {
                is3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("context被销毁了");
    }
}
