package bao8;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Title login_servlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\16 0016 15:14
 */
public class login_servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dao d=new dao();
        String method=req.getParameter("method");
      if (method.equals("login")){
          String name=req.getParameter("username");
          person p=d.getperson(name);
          if (p!=null) {
              List<authority> authorities=d.getallauthority();
              req.getSession().setAttribute("p",p);
              req.getSession().setAttribute("authorities",authorities);
              resp.sendRedirect("/jsp8/list.jsp");
              return;
          }
          else {
              req.getSession().setAttribute("message","用户不存在");
              resp.sendRedirect("/jsp8/login.jsp");
          }
      }
      else {
          req.getSession().invalidate();
          resp.sendRedirect("/jsp8/login.jsp");
          return;
      }
    }
}
