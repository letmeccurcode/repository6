package cn.itcast05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        设置请求参数的编码格式
        request.setCharacterEncoding("utf-8");
//        获取请求参数

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //拿到用户名和密码之后 去数据库中查找
        User user = new User(username, password);

//        如果表记录存在 result就不为空 如果不存在 返回的是null
        User result = UserDao.findUser(user);

        if (result != null){
            request.setAttribute("user", result);
            request.getRequestDispatcher("successServlet").forward(request, response);
        }else{
            request.getRequestDispatcher("failedServlet").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
