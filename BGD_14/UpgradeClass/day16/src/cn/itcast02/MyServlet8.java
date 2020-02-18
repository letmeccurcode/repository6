package cn.itcast02;

import cn.itcast01.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet8")
public class MyServlet8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        this.getServletContext();
        request.setCharacterEncoding("utf-8");

//        getParameter 是获取请求参数
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        // request可以作为一个域使用 可以在多个资源中共享数据
//        User user = new User(username, password);
//        request.setAttribute("user",user);

        request.getServletContext().setAttribute("str", "zhangsan");

        request.getRequestDispatcher("MyServlet9").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
