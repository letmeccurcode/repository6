package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/demo6")
public class MyServlet6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String getHeader(String name) 获取请求头信息
        System.out.println("客户端信息:" + request.getHeader("User-Agent"));
//        Enumeration<String> getHeaderNames() 获取所有的请求头信息
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + ":" + value);
        }
//        String getMethod() 获取客户端的提交方式
        System.out.println("提交方法:"+request.getMethod());
//        String getQueryString() 获取get请求的请求参数
        System.out.println("请求参数:"+request.getQueryString());
//        String getServletPath() 获取Servlet的请求资源路径

        System.out.println("请求资源路径:"+request.getServletPath());
//        String getRequestURI()
        System.out.println("统一资源标识符:"+request.getRequestURI());
//        StringBuffer getRequestURL()
        System.out.println("统一资源定位符:"+request.getRequestURL());
//        String getContextPath()
        System.out.println("项目路径:"+request.getContextPath()); //√
//        getProtocol
        System.out.println("协议:"+request.getProtocol());
//        getServerPort
        System.out.println("port:"+request.getServerPort());
//        getParameter()
//        getParameterNames
    }
}
