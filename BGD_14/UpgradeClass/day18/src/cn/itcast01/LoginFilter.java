package cn.itcast01;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/index")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        if(name != null && !"".equals(name)){
            chain.doFilter(req, resp);
        }else{
            response.sendRedirect(request.getContextPath()+"/login.html");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
