package cn.itcast03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取session对象
        HttpSession session = request.getSession();
        //2.从session对象中获取保存的用户信息
        Object name = session.getAttribute("name");
        //3.判断用户信息是否存在，
        if (name != null && !"".equals(name)){
            //4.存在，登陆成功，返回“您好，xxx”
            //需要设置响应信息的字符编码
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("您好，"+name);
        }else{
            //5.不存在，未登陆，跳转到登陆页面，进行登陆操作
            //response.sendRedirect("/SessionDemo/login.html");
            //request.getContextPath()获取/SessionDemo
            System.out.println("request.getContextPath()="+request.getContextPath());
            response.sendRedirect(request.getContextPath()+"/login.html");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
