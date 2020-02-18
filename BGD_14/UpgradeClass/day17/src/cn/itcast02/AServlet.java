package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/as1")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpServlet
//        Cookie cookie = new Cookie("str1", "helloworld");

        String s = URLEncoder.encode("我是一 个中 国人", "utf-8");
//        %E6%88%91% 我
//        %E6%98%AF 是
//        %E4%B8%80+ 一
        System.out.println(s);
        Cookie cookie = new Cookie("str1", s);
//        java.lang.IllegalArgumentException: An invalid character [32] was present in the Cookie value
        cookie.setMaxAge(60 * 60);
//        Cookie cookie1 = new Cookie("str2", "hellojava");
//        Cookie cookie2 = new Cookie("str3", "helloMysql");
        response.addCookie(cookie);
//        response.addCookie(cookie1);
//        response.addCookie(cookie2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
