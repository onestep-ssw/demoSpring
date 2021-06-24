package com.spring.demo.jdbc;

import java.sql.*;

/**
 * @author ssw
 * @description
 * @date 2021/5/31
 */

public class JdbcUtils {

    private final static String url="jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai";
    private final static String userName="root";
    private final static String password="12345";
    /**
     * 创建链接
     * @return  121.196.185.4
     */
    public static Connection createConnection(){
        Connection connection = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取链接
            connection = DriverManager.
                    getConnection(url, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


    /**
     * 关闭资源
     * @param resultSet
     * @param preparedStatement
     * @param connection
     */
    public static void closeConnection(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection){
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
