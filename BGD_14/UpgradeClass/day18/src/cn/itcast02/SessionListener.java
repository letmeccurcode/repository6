package cn.itcast02;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//@WebListener
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent hs) {
        HttpSession session = hs.getSession();
        session.setMaxInactiveInterval(10);

        ServletContext context = session.getServletContext();
        System.out.println("有人来访问tomcat服务器了");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hs) {
        System.out.println("有人断开了和tomcat服务器的链接");

        //tomcat会为每一个客户端的访问创建一个session对象
        //该session对象默认的周期是三十分钟
        //手动设置session存活时长 setMaxInactiveInterval 以秒计时
    }
}
