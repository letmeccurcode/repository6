package cn.itcast01;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerDemo implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent s) {
//        System.out.println("我被创建了");
        ServletContext context = s.getServletContext();

        String conf1 = context.getInitParameter("conf1");
        String path1 = context.getRealPath(conf1);
        String conf2 = context.getInitParameter("conf2");
        String path2 = context.getRealPath(conf2);
        String conf3 = context.getInitParameter("conf3");
        String path3= context.getRealPath(conf3);

        System.out.println(conf1);
        System.out.println(conf2);
        System.out.println(conf3);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("我被销毁了");
    }
}
