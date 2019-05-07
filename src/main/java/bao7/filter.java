package bao7;

import jdk.nashorn.internal.ir.RuntimeNode;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Title filterauthority
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 9:12
 */
public class filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse= (HttpServletResponse) servletResponse;
        HttpSession session=httpServletRequest.getSession();
        String name= (String) session.getAttribute("name");
        if (name==null||name.equals("")){
            session.setAttribute("mo","请先登录");
            httpServletResponse.sendRedirect("/jsp6/index.jsp");
            return;
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
