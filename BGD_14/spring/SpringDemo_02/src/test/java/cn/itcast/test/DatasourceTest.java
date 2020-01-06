package cn.itcast.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DatasourceTest {

    @Test
    public void m1() throws Exception {
        ComboPooledDataSource s = new ComboPooledDataSource();
        s.setDriverClass("com.mysql.jdbc.Driver");
        s.setJdbcUrl("jdbc:mysql://localhost:3306/mydb01");
        s.setUser("root");
        s.setPassword("123");
        Connection conn = s.getConnection();
        System.out.println(conn);
    }

    @Test
    public void m2() throws Exception {
//        DataSource s = DruidDataSourceFactory.createDataSource();
        DruidDataSource s = new DruidDataSource();
        s.setDriverClassName("com.mysql.jdbc.Driver");
        s.setUrl("jdbc:mysql://localhost:3306/mydb01");
        s.setUsername("root");
        s.setPassword("123");
        DruidPooledConnection conn = s.getConnection();
        System.out.println(conn);
        conn.close();
    }

    @Test
    public void m3() throws Exception {
        ResourceBundle r = ResourceBundle.getBundle("db");
        String driver = r.getString("jdbc.driver");
        String url = r.getString("jdbc.url");
        String username = r.getString("jdbc.username");
        String password = r.getString("jdbc.password");

        ComboPooledDataSource s = new ComboPooledDataSource();
        s.setDriverClass(driver);
        s.setJdbcUrl(url);
        s.setUser(username);
        s.setPassword(password);
        Connection conn = s.getConnection();
        System.out.println(conn);
    }

/*
    @Test
    public void m4() throws Exception {
        Properties p = new Properties();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("db.properties");
        p.load(is);
        DataSource s = DruidDataSourceFactory.createDataSource(p);
        Connection conn = s.getConnection();
        System.out.println(conn);
    }
    */

    @Test
    public void m5() throws Exception {
        ApplicationContext a = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DataSource source = a.getBean(DataSource.class);
        Connection conn = source.getConnection();
        System.out.println(conn);
    }
}
