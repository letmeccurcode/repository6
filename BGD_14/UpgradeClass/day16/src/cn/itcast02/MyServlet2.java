package cn.itcast02;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyServlet2 extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//        HttpServletRequest request1 = (HttpServletRequest) request;
//        String method = request1.getMethod();
//        if (method.contains("get")){
//
//        }else if(method.contains("post")){
//
//        }
    }
}
