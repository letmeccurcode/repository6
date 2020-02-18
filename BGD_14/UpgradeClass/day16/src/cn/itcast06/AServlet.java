package cn.itcast06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/as2")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("cookie1", "我是一个新的cookie1");
        cookie1.setMaxAge(3000);//将cookie持久化到本地文件中 30秒后删除
//        Cookie cookie2 = new Cookie("cookie2", "我是一个新的cookie2");
//        Cookie cookie3 = new Cookie("cookie3", "我是一个新的cookie3");
        response.addCookie(cookie1);
//        response.addCookie(cookie2);
//        response.addCookie(cookie3);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
