package cn.itcast01;

import cn.itcast02.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);

        User result = UserDao.queryUser(user);

        if (result != null){
           req.setAttribute("user", result);
           req.getRequestDispatcher("/successservlet").forward(req, resp);
        }else{
            req.getRequestDispatcher("/failservlet").forward(req, resp);
        }
    }
}
