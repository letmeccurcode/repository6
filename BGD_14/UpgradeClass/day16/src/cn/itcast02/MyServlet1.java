package cn.itcast02;

import javax.servlet.*;
import java.io.IOException;

//Servlet只会被创建一次
public class MyServlet1 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

//    service方法是会被调用的 浏览器每次访问该servlet service方法都会被执行一次
//    service方法是一个成员方法 对象名.方法名()
//    MyServlet1对象的创建是Tomcat服务器来完成
//    localhost:8080/web16/h1.html
//    localhost:8080/web16/helloServlet
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("MyServlet1被访问了!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
