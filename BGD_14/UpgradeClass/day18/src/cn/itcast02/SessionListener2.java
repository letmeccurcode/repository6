package cn.itcast02;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener2 implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent hs) {
        //session对象创建时执行
        HttpSession session = hs.getSession();
        ServletContext context = session.getServletContext();

        System.out.println("有人来了");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        //session对象销毁时执行 默认存活三十分钟
        System.out.println("有人走了");
    }
}
