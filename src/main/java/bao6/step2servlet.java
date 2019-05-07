package bao6;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title step2servlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\15 0015 15:21
 */
public class step2servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= String.valueOf(req.getSession().getAttribute("name"));
        String address=req.getParameter("address");
        String card=req.getParameter("card");
        Integer phone= Integer.valueOf(req.getParameter("phone"));
        person p=new person(name,address,card,phone);
        req.getSession().setAttribute("person",p);
        resp.sendRedirect("/jsp6/confirm.jsp");
    }
}
