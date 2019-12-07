package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String host = "localhost";
    private static final int port = 3306;
    private static final String database = "tmall";
    private static final String username = "root";
    private static final String password = "admin";
    private static final String encoding = "utf-8";
    static {
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.h2.Driver");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        //String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",host,port,database,encoding);
        String url = "jdbc:h2:mem:tmall;MODE=MYSQL;INIT=runscript from './small.sql'";
        return DriverManager.getConnection(url,username,password);
    }
}
