package bao1;


import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Title helloservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\10 0010 9:31
 */
public class helloservlet implements Servlet {

    public helloservlet() {
        System.out.println("gouzaoqi");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
        String user=servletConfig.getInitParameter("user");
        System.out.println("user:"+user);
        Enumeration<String> names=servletConfig.getInitParameterNames();
        while (names.hasMoreElements())
        {
            String name=names.nextElement();
            String value=servletConfig.getInitParameter(name);
            System.out.println("name:"+name+", value:"+value);
        }
//        获取 ServletContext 对象
        ServletContext servletContext=servletConfig.getServletContext();
        Enumeration<String> enumeration=servletContext.getInitParameterNames();
        while (enumeration.hasMoreElements())
        {
            String name=enumeration.nextElement();
            String value=servletContext.getInitParameter(name);
            System.out.println("name:  "+name+",    value:  "+value);
        }
        //获取servlet名称
        String servletname=servletConfig.getServletName();
        System.out.println(servletname);
//        获取当前 WEB 应用的某一个文件在服务器上的绝对路径, 而不是部署前的路径
        String realpath=servletContext.getRealPath("/jsp/hello.jsp");
        System.out.println("realpath:"+realpath);
        String contestpath=servletContext.getContextPath();
        System.out.println("contestpath:"+contestpath);
        System.out.println();
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("boot.service.....");
    }

    @Override
    public String getServletInfo() {

        System.out.println("getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
