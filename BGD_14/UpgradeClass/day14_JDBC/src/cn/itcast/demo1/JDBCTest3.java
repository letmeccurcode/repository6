/*
package cn.itcast.demo1;

import cn.itcast.Tool.jdbcUtil;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTest3 {

    @Test
    public void m1(){
        */
/*
            1 引入jar包
            2 定义配置文件(建议赋值粘贴)
            3 读取配置文件信息
            4 创建连接池对象
            5 获取链接对象
         *//*


        try {
            Properties p = new Properties();

            ClassLoader loader = JDBCTest3.class.getClassLoader();

            InputStream stream = loader.getResourceAsStream("druid.properties");

            p.load(stream);

            DataSource ds = DruidDataSourceFactory.createDataSource(p);

            Connection conn = ds.getConnection();

//            conn.setAutoCommit();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    @Test
    public void m2(){
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "insert into student(stuid,sname) value(?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, 6);
            pst.setString(2, "赵六");
            pst.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
