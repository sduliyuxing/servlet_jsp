package bao9;

import javax.servlet.*;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Set;

/**
 * @Title hellolistener
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\18 0018 10:28
 */
public class hellolistener implements ServletRequestListener,ServletContextListener,HttpSessionListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextEvent...创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextEvent...销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequestEvent....销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequestEvent....创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSessionEvent...创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSessionEvent...销毁");
    }
}
