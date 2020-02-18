package cn.itcast02;

import cn.itcast01.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet9")
public class MyServlet9 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        getAttribute是为了获取域中共享的数据
//        User user = (User) request.getAttribute("user");
//
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//        System.out.println("转发成功 MyServlet9的dopost方法执行!");

        request.setCharacterEncoding("utf-8");

//        getParameter 是获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
