package bao2;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * @Title bao2.loginservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\10 0010 15:49
 */
public class loginservlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("。。。。。。。。。。请求中。。。。。。。。");
        System.out.println("请求名称： "+request);

        String user=request.getParameter("user");
        String password=request.getParameter("password");
        System.out.println("用户名："+user+"   密码："+password);
        String in=request.getParameter("interesting");
        System.out.println(in);
        String a[]=request.getParameterValues("interesting");
        for(String x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        Enumeration<String> names = request.getParameterNames();
        while(names.hasMoreElements()){
            String name = names.nextElement();
            String val = request.getParameter(name);
            System.out.print(name + ": " + val+"      ");
        }
        System.out.println();

        Map<String, String[]> map = request.getParameterMap();
        for(Map.Entry<String,String[]> x:map.entrySet())
        {
            System.out.println(x.getKey()+" "+Arrays.asList(x.getValue()));
        }

        HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        String url=httpServletRequest.getRequestURI();
        System.out.println("url: "+url);
        String method=httpServletRequest.getMethod();
        System.out.println("method: "+method);
//        若是一个 GET 请求, 获取请求参数对应的那个字符串, 即 ? 后的字符串
        String query=httpServletRequest.getQueryString();
        System.out.println("query: "+query);
//        获取请求的 Serlvet 的映射路径
        String servletpath=httpServletRequest.getServletPath();
        System.out.println("servletpath： "+servletpath);
        System.out.println();
        PrintWriter printWriter=response.getWriter();
        printWriter.print("login....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
    }
}
