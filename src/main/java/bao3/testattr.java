package bao3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Title testattr
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\11 0011 11:50
 */
public class testattr extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      servlet中无法获得pagecontext对象
        PrintWriter printWriter=resp.getWriter();

        Object requestattr=req.getAttribute("request");
        System.out.println("request:"+requestattr);
        printWriter.print("request:"+requestattr);
        printWriter.print("<br><br>");

        Object sessionattr=req.getSession().getAttribute("session");
        System.out.println("session:"+sessionattr);
        printWriter.print("session:"+sessionattr);
        printWriter.print("<br><br>");

        Object applicationattr=getServletContext().getAttribute("application");
        System.out.println("application:"+applicationattr);
        printWriter.print("application:"+applicationattr);
        printWriter.print("<br><br>");
    }
}
