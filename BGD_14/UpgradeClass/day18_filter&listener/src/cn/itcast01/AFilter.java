package cn.itcast01;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/AFilter")
@WebFilter("/*")
public class AFilter implements Filter {
    public void destroy() {
        System.out.println("过滤器被销毁了");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("我被拦截了");
            chain.doFilter(req, resp);
        System.out.println(chain);
        System.out.println("我被放行了");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器被创建了");
    }
}
