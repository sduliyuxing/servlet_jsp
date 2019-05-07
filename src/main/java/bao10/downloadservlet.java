package bao10;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * @Title downloadservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\18 0018 16:59
 */
public class downloadservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/x-msdownload");
        String filename="tupian.jpg";
        resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
        OutputStream outputStream=resp.getOutputStream();
        String path="F:\\edasedas\\ideaWorkspace\\a5\\web\\boot.run.jpg";
        InputStream inputStream=new FileInputStream(path);
        byte []buffer=new byte[1024];
        int len=0;
        while ((len=inputStream.read(buffer))!=-1){
             outputStream.write(buffer,0,len);
        }
        inputStream.close();
        outputStream.close();
    }
}
