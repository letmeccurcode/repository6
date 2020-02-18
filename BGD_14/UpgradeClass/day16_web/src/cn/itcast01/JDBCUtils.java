package cn.itcast01;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class JDBCUtils {

//    1 工具类中需要对外提供一个获取连接池对象的方法 getDs
//    2 配置文件中的用户名key必须叫作username
//    3 执行SQL的时候如果sql需要传参,那就必须依次传入实参
    private static DataSource ds;

    static {
        try {
            Properties p = new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            p.load(is);
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDs() {
        return ds;
    }
}
