package cn.itcast.Tool;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Collection;
import java.util.Properties;
import java.util.concurrent.Callable;

public class jdbcUtil {
    private static String driverClass=null;
    private static String url=null;
    private static String username=null;
    private static String password=null;

    private jdbcUtil() {
    }

    //类加载阶段执行,且只执行一次
    static {
        try {
            //创建prpperties集合对象
            Properties p = new Properties();
            //根据当前类的字节码对象获取加载该类的加载器对象
            ClassLoader loader = jdbcUtil.class.getClassLoader();
            //通过指定的文件名获取该文件对应的输入流对象,该方法是从src路径下寻找指定的文件
            InputStream is = loader.getResourceAsStream("db.properties");
            p.load(is);
            driverClass = p.getProperty("driverClass");
            url=p.getProperty("url");
            username=p.getProperty("username");
            password=p.getProperty("password");
            //加载驱动
            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return conn;
        }
    }
    //释放资源
    public static void getClose(ResultSet rs, Statement st, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public static void getClose(Statement st, Connection conn) {
        if(st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

