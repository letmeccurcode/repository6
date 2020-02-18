package cn.itcast03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //登陆操作

        //设置请求的字符编码集
        request.setCharacterEncoding("utf-8");
        //1.获取用户名和密码
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        //应该是去数据库中做查询
        //2.判断用户名是否是张三，密码是否是123
        if ("张三".equals(userName) && "123".equals(passWord)){
            //3.是，登陆成功，访问indexservlet,需要将用户名保存到session
            HttpSession session = request.getSession();
            session.setAttribute("name",userName);
            //请求转发
            request.getRequestDispatcher("IndexServlet").forward(request,response);
        }else{
            //4.不是，登陆失败，重定向到登陆页面，让用户重新登陆
            response.sendRedirect(request.getContextPath()+"/login.html");
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
