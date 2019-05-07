package bao8;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Title filterauthority
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 11:15
 */
public class filterauthority implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse res= (HttpServletResponse) servletResponse;
        String servletpath = req.getServletPath();
        person p= (person) req.getSession().getAttribute("p");
        if (p==null){
            res.sendRedirect("/jsp8/login.jsp");
            return;
        }
        List<authority> list=p.getList();
        authority a=new authority(null,servletpath,0);
        for (authority au:list){
            if (au.getUrl().equals(servletpath)){
                filterChain.doFilter(req,res);
                return;
            }
        }
        res.sendRedirect("/jsp8/403.jsp");
    }

    @Override
    public void destroy() {

    }

}
