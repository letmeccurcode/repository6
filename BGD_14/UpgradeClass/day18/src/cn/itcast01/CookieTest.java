package cn.itcast01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/aaa")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //获取Cookie对象
        Cookie[] cookies = request.getCookies();
        System.out.println("你好");
        //1.如果cookie数组不为空,且长度大于0,那么对数组进行遍历
        //2.定义一个boolean变量,如果cookie中存在上次访问时间,则为true,否在为false
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                //遍历cookie,判断是否存在lastTime
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    flag = true;
                    String value = cookie.getValue();
                    //如果存在lastTime,就返回上次访问的时间
                    response.getWriter().write("<h1>欢迎回来</h1>");
                    System.out.println("hello");
                    //并且把本次访问的时间封装到cookie中
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
                    String str_date = sdf.format(date);
                    System.out.println("本次访问时间:" + str_date);
                    //把当前的时间进行url编码,避免空格无法识别问题
                    String encode_str_date = URLEncoder.encode(str_date, "utf-8");
                    //把编码后的当前访问时间封装到cookie中
                    cookie.setValue(encode_str_date);
                    //设置cookie保存时间为30天
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(cookie);
                    break;
                }
            }
        }

        if (cookies == null || cookies.length == 0 || flag == false) {
            response.getWriter().write("欢迎您首次访问");
            //往页面上写欢迎信息的操作应该放在最后 放在前面的华如果写完 整个响应就结束了 后面的代碼就不执行了
            //把本次访问时间存到cookie中,并封装到response中
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
            String str_date = sdf.format(date);
            //把当前的时间进行url编码,避免空格无法识别问题
            str_date = URLEncoder.encode(str_date, "utf-8");
            //把编码后的当前访问时间封装到当前cookie中
            Cookie cookie = new Cookie("lastTime", str_date);
            //设置cookie保存时间为30天
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
            //如果是第一次访问,则给浏览器返回,首次访问
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
