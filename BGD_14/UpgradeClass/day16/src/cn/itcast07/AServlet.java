package cn.itcast07;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/as3")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

//        Cookie cookie = new Cookie("JSESSIONID", session.getId());
//        cookie.setMaxAge(60 * 60);
        session.setAttribute("str", "hello");
//        response.addCookie(cookie);
        System.out.println(session);
//        org.apache.catalina.session.StandardSessionFacade@cbe9e86
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
