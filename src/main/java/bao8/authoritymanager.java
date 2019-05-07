package bao8;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Title authoritymanager
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 15:46
 */
public class authoritymanager implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        dao d=new dao();
        String name=request.getParameter("username");
        String method=request.getParameter("method");
        person p=d.getperson(name);
        if (method.equals("get")){
            List<authority> authorities=d.getallauthority();
            request.getSession().setAttribute("message","");
            request.getSession().setAttribute("p",p);
            request.getSession().setAttribute("authorities",authorities);
            response.sendRedirect("/jsp8/manager.jsp");
        }
        else {
            List<authority>list00=d.getallauthority();
            for (authority a:list00){
                a.setFlag(0);
            }
            request.getSession().setAttribute("authorities",list00);
            String []authorities=request.getParameterValues("authority");
            List<authority> authorityList=d.getauthority(authorities);
            d.update(name,authorityList);
            request.getSession().setAttribute("p",p);
            response.sendRedirect("/jsp8/manager.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
