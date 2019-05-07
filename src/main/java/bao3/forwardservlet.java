package bao3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title forwardservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\11 0011 9:27
 */
public class forwardservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("转发。。。");
        req.setAttribute("name","abc");
        req.setAttribute("passward","123456");
        System.out.println("name:"+req.getAttribute("name")+", passward:"+req.getAttribute("passward"));
        String path="jsp3/hello.jsp";
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/"+path);
        requestDispatcher.forward(req,resp);
    }
}
