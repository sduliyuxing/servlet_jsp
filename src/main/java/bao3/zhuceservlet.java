package bao3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @Title zhuceservlet
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\11 0011 15:19
 */
public class zhuceservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user1=req.getParameter("user");
        String passward1=req.getParameter("passward");
        System.out.println(user1);
        System.out.println(passward1);
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        PrintWriter printWriter=resp.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/a";
            String jdbcname="root";
            String jdbcpassward="123456";
            connection = DriverManager.getConnection(url, jdbcname, jdbcpassward);
            String sql="select count(id) from yonghu where name=?"+"and passward=?";
            statement=connection.prepareStatement(sql);
            ((PreparedStatement) statement).setString(1,user1);
            ((PreparedStatement) statement).setString(2,passward1);
            resultSet=((PreparedStatement) statement).executeQuery();

            if (resultSet.next())
            {
                int count=resultSet.getInt(1);//count(id)
                if (count>0)
                {
                    printWriter.print("hello:  "+user1);
                }
                else {
                    printWriter.print("cuowu");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (resultSet!=null)
                {resultSet.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (statement!=null)
                {statement.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection!=null)
                {connection.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
