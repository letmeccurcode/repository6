package cn.itcast02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/TestCookieDemo1")
public class TestCookieDemo1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //整体需求：判断cookie中是否有名称为lastTime的cookie,有...，没有...

        //设置字符编码集
        response.setContentType("text/html;charset=utf-8");

        boolean flag = false;//标识是否是lastTime名称的cookie,true:是，false:不是

        //1.获取cookie，cookie的数组
        Cookie[] cookies = request.getCookies();
        //判断cookie数组中是否有cookie
        if (cookies != null && cookies.length > 0){
            //2.遍历cookie的数组
            for (Cookie cookie : cookies) {
                //3.获取cookie的名称
                String name = cookie.getName();
                //4.判断cooke的名称是否是lastTime
                if ("mylasttime".equals(name)){
                    //5.是，返回浏览器信息：欢迎回来，您上次访问的时间  xxxx年xx月xx日 xx:xx:xx
                    //获取cookie的值，保存的就是上次访问的时间
                    String value = cookie.getValue();
                    System.out.println("解码前："+value);
                    //获取到浏览器传递过来的日期之后，需要对日期进行解码
                    value = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码前："+value);
                    response.getWriter().write("<h1> 欢迎回来，您上次访问的时间："+value+"</h1>");
                    flag = true;

                    //这次访问也是一次访问，也是需要记录访问时间到cookie中的
                    //将新的访问时间保存到cookie,封装response中，响应给浏览器保存，方便下一次再访问的时候可以获取到这次的访问时间
                    Date date = new Date();
                    //将日期转化为字符串
                    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = format.format(date);//将日期转化为字符串

                    System.out.println("编码前："+str_date);
                    //需要使用URL编码来解决日期中空格编码的问题
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    System.out.println("编码后："+str_date);

                    cookie.setValue(str_date);//给cookie设置一个值，时间
                    //设置cookie的保存时间
                    cookie.setMaxAge(60*60*24*30);//单位是秒
                    //封装response,响应给浏览器
                    response.addCookie(cookie);
                    break;//跳出循环
                }
            }
        }

        //6.不是，返回浏览器信息：欢迎您，首次访问
        if (cookies == null || cookies.length == 0 || flag == false){

            response.getWriter().write("<h1>欢迎您，首次访问</h1>");
            //将访问时间存储到cookie,响应给浏览器，保存
            Date date = new Date();
            //将日期转化为字符串
            SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = format.format(date);//将日期转化为字符串

            System.out.println("编码前："+str_date);
            //需要使用URL编码来解决日期中空格编码的问题
            str_date = URLEncoder.encode(str_date, "utf-8");
            System.out.println("编码后："+str_date);

            Cookie cookie = new Cookie("mylasttime",str_date);
            //设置cookie的保存时间
            cookie.setMaxAge(60*60*24*30);//单位是秒
            //封装response,响应给浏览器
            response.addCookie(cookie);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
