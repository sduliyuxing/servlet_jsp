package bao4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title deletebyid
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\11 0011 17:45
 */
public class deletebyid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id= Integer.valueOf(req.getParameter("id"));
        System.out.println(id);
        studentdao s=new studentdao();
        s.deletebyid(id);
        req.getRequestDispatcher("/jsp4/success.jsp").forward(req,resp);
    }
}
