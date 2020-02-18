package cn.itcast.filter.Demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1.获取登陆用户名和密码
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        //2.判断用户名是否是张三，判断密码是否是123
        if ("张三".equals(userName) && "123".equals(passWord)){
            //3.获取session
            HttpSession session = request.getSession();
            //4.存储用户名称
            session.setAttribute("name",userName);
            //5.跳转到首页
            request.getRequestDispatcher("indexServlet").forward(request,response);
        }else{

            response.sendRedirect(request.getContextPath()+"/login.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
}
