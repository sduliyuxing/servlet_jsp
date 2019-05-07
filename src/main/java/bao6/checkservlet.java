package bao6;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title checkservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\12 0012 17:17
 */
public class checkservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String checkname=req.getParameter("checkname");
        String check_name= (String) req.getSession().getAttribute("check_name");
        String passward=req.getParameter("passward");
        String name=req.getParameter("name");
        String check=checkname.toLowerCase();
        String check_=check_name.toLowerCase();
        if (!(name!=null&&name.length()>0&&passward.equals("123456"))){
            req.getSession().setAttribute("no","用户名或密码错误");
            resp.sendRedirect("/jsp6/index.jsp");
            return;
        }
        if (!(check!=null&&check.equals(check_)))
        {
            req.getSession().setAttribute("message","验证码不一致");
            resp.sendRedirect("/jsp6/index.jsp");
            return;
        }
        req.getSession().setAttribute("name",name);
        resp.sendRedirect("/jsp6/step1.jsp");
    }
}
