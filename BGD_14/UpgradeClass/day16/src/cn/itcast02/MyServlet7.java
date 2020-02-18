package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/demo7")
public class MyServlet7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置请求参数的编码格式
        request.setCharacterEncoding("utf-8");

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

//        String hobby = request.getParameter("hobby");
//        System.out.println(username + ":" + password + ":" + hobby + ":post");

        Map<String, String[]> map = request.getParameterMap();

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s+":"+Arrays.toString(map.get(s)));
//            String[] var = map.get(s);
//            for (String value : var) {
//                System.out.println(s + ":" + value);
//            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
