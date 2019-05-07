package bao9;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @Title testlistener
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\18 0018 10:29
 */
public class testlistener implements ServletContextAttributeListener,ServletRequestAttributeListener,HttpSessionAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("向 request 中添加了一个属性: " + srae.getName() + ": " + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("从 request 中移除了一个属性: " + srae.getName() + ": " + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("request 中属性替换了: " + srae.getName() + ": " + srae.getValue());
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

    }
}
