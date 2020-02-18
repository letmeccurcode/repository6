package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:8080/web/MyServlet5
//web是我们创建的项目的虚拟目录
//bbb是访问的资源名称
@WebServlet("/bbb")
public class MyServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get方法被执行了!");
        //request对象里面封装了请求数据 包含 请求行/请求头/请求参数

        String header = req.getHeader("User-Agent");
        System.out.println(header);

        System.out.println(req);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
