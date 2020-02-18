package cn.itcast02;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountNumListener implements HttpSessionListener {

    //定义一个成员变量
    int count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {//创建了session对象的时候执行
        count++;
        HttpSession session = httpSessionEvent.getSession();

        //设置session对象的存活时间 时间到就认为该用户已断开和服务器的链接
        session.setMaxInactiveInterval(10);

        ServletContext context = session.getServletContext();

        context.setAttribute("num", count);

        context.setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {//session对象销毁的时候执行
        count--;
        HttpSession session = httpSessionEvent.getSession();
        ServletContext context = session.getServletContext();
        context.setAttribute("count",count);
    }
}
