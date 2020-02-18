package cn.itcast.demo1;


import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

public class JDBCTest1 {

    @Test
    public void test1() {
        Connection conn = null;
        Statement st = null;
//        Connection conn;
//        Statement st;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取链接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb07", "root", "123");
            conn = DriverManager.getConnection("jdbc:mysql:///mydb07", "root", "123");
            //定义sql语句
            String sql = "insert into class values(null,'四班')";
            //获取执行sql语句的statement对象
            st = conn.createStatement();
            //执行sql
//            boolean b = st.execute(sql);
            int i = st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
//        局部变量必须 先赋值再使用
        String s = null;
        if (s != null) {
            s.charAt(0);
        }
    }

    @Test
    public void test3() {
        Connection conn = null;
        Statement st = null;
//        Connection conn;
//        Statement st;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取链接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb07", "root", "123");
            conn = DriverManager.getConnection("jdbc:mysql:///mydb07", "root", "123");
            //定义sql语句
//            String sql = "insert into class values(null,'四班')";
//            String sql = "update student set sname = '老八' where stuid = 1";
            String sql = "delete from student where stuid = 4";
            //获取执行sql语句的statement对象
            st = conn.createStatement();
            //执行sql
//            boolean b = st.execute(sql);
            int i = st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///mydb07", "root", "123");
            String sql = "select * from student";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            ArrayList<Student> list = new ArrayList<>();

            while (rs.next()) {
                int stuid = rs.getInt("stuid");
                String sname = rs.getString("sname");
                String sex = rs.getString("sex");
                String addr = rs.getString("address");
                int cid = rs.getInt("classid");
//                System.out.println(stuid + "," + sname + "," + sex + "," + addr + "," + cid);
                //定义一个实体类 和mysql表字段一一对应的
                Student s = new Student(stuid, sname, sex, addr, cid);
                list.add(s);
            }

            for (Student stu : list) {
                System.out.println(stu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
