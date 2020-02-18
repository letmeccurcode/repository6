package cn.itcast;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sc) {
        ServletContext context = sc.getServletContext();
//        context.setAttribute();
        String xxx = context.getInitParameter("xxx");
        String xxx1 = context.getRealPath("xxx");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sc) {

    }
}
