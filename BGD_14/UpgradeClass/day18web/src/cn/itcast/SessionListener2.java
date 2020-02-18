package cn.itcast;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener2 implements HttpSessionListener {


    public SessionListener2(){
        System.out.println("session来了");
    }
    Integer count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent hs) {
        count++;
        //session对象创建时执行
        HttpSession session = hs.getSession();
        ServletContext context = session.getServletContext();

        context.setAttribute("num", count);
        session.setMaxInactiveInterval(60);
//        session.invalidate();
        System.out.println("有人来了");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hs) {
        //session对象销毁时执行 默认存活三十分钟
        count--;
        HttpSession session = hs.getSession();
        ServletContext context = session.getServletContext();
        context.setAttribute("num", count);
        System.out.println("有人走了");
    }
}
