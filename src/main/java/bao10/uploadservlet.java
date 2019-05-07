package bao10;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.RequestContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * @Title uploadservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\19 0019 9:36
 */
public class uploadservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DiskFileItemFactory factory=new DiskFileItemFactory();
//        factory.setSizeThreshold(1024*500);
        File file1=new File("E:\\abcde");
        factory.setRepository(file1);
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        fileUpload.setHeaderEncoding("UTF-8");
//        设置单个文件大小 单位字节 B
        fileUpload.setFileSizeMax(1024*1024*3);
//        设置总的文件大小
        fileUpload.setSizeMax(1024*1024*6);
        try {
            List<FileItem> fileItemList=fileUpload.parseRequest(req);
            for (FileItem item:fileItemList)
            {
                if (item.isFormField()){
                    if (item.getName()!="submit"){
                    String name=item.getName();
                    String value=item.getString();
                    System.out.println("name:"+name);
                    System.out.println("value:"+value);
                    }
                }
                else {
                    String idname=item.getFieldName();
                    String name=item.getName();
                    String type=item.getContentType();
                    long size=item.getSize();
                    System.out.println("idname:"+idname);
                    System.out.println("name:"+name);
                    System.out.println("type:"+type);
                    System.out.println("size:"+size+"KB");
                    InputStream inputStream=item.getInputStream();
                    byte buffer[]=new byte[1024];
                    int len=0;
                    name="E:\\abcde\\"+name;
                    System.out.println("name:"+name);
                    OutputStream outputStream=new FileOutputStream(name);
                    while ((len=inputStream.read(buffer))!=-1){
                        outputStream.write(buffer,0,len);
                    }
                    inputStream.close();
                    outputStream.close();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
