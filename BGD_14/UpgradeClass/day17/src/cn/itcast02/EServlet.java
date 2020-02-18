package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/es")
public class EServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        org.apache.catalina.session.StandardSessionFacade@6108394
//        org.apache.catalina.session.StandardSessionFacade@53d03dda
        HttpSession session1 = request.getSession();

//        getId()方法可以获取当前session对象的id值
        System.out.println(session1.getId());
//        D883695151331A76CEE21508DAE535CB

        Cookie cookie = new Cookie("JSESSIONID", session1.getId());
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
        System.out.println(session1);
    }

//    org.apache.catalina.session.StandardSessionFacade@2f449427
//    org.apache.catalina.session.StandardSessionFacade@5a19129f
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
