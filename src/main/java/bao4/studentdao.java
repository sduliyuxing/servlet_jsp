package bao4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title studentdao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\11 0011 17:20
 */
public class studentdao {
    public void deletebyid(Integer ID)
    {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/a";
            String jdbcname="root";
            String jdbcpassward="123456";
            connection = DriverManager.getConnection(url, jdbcname, jdbcpassward);
            String sql="delete from yonghu where id=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,ID);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (preparedStatement!=null)
                {preparedStatement.close();}
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

    public List<student> getall()
    {
        List<student> students=new ArrayList<student>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/a";
            String jdbcname="root";
            String jdbcpassward="123456";
            connection = DriverManager.getConnection(url, jdbcname, jdbcpassward);
            String sql="select id,name,passward from yonghu";
            statement=connection.prepareStatement(sql);
            resultSet=((PreparedStatement) statement).executeQuery();
            while (resultSet.next()){
                Integer id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String passward=resultSet.getString(3);
                student s=new student(id,name,passward);
                students.add(s);
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
        return students;
    }
}
