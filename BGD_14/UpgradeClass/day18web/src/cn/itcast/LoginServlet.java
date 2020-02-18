package cn.itcast;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ((username.equals("lisi") && password.equals("123")) || (username.equals("tom") && password.equals("321"))) {
//            HttpSession session = request.getSession();
//            session.setAttribute("name", username);
//            request.getRequestDispatcher("index").forward(request, response);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("<h1>" + username + "你好 当前在线人数" + request.getServletContext().getAttribute("num") + "</h1>");
        }
//        }else{
//            response.sendRedirect(request.getContextPath()+"/login.html");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
