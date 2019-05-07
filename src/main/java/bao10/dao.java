package bao10;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Title dao
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\22 0022 11:42
 */
public class dao<T> {
    public QueryRunner runner=new QueryRunner();
    private Class<T> clazz;
    public dao() {

        Type type = getClass().getGenericSuperclass();

        if(type instanceof ParameterizedType){
            ParameterizedType pt = (ParameterizedType) type;

            Type [] parameterArgs = pt.getActualTypeArguments();

            if(parameterArgs != null && parameterArgs.length > 0){
                if(parameterArgs[0] instanceof Class){
                    clazz = (Class<T>) parameterArgs[0];
                }
            }
        }

    }

    public void update(Connection connection,String sql,Object...arg) throws SQLException {
        runner.update(connection,sql,arg);
    }
    public T get(Connection connection,String sql,Object...arg) throws SQLException {
        return runner.query(connection,sql,new BeanHandler<T>(clazz),arg);
    }
    public List<T> getlist(Connection connection,String sql,Object...arg) throws SQLException {
        return (List<T>) runner.query(connection,sql,new BeanHandler<T>(clazz),arg);
    }
    protected <E> E getValue(Connection conn, String sql, Object ... args) throws SQLException{
        E result = null;
        result = (E) runner.query(conn, sql, new ArrayHandler(), args)[0];
        return result;
    }
}
