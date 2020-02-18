package cn.itcast06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/servleta2")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("str", "HelloMySQL");

//        request.getRequestDispatcher("/servletb2").forward(request, response);
//        同一次会话的请求转发中可以共享数据
//        同一次会话的不同请求中不可以共享数据
//        不同会话之间不能共享数据
        response.sendRedirect("/web/servletb2");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
