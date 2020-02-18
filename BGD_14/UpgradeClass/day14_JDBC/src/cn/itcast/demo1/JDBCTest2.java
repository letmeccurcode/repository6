/*
package cn.itcast.demo1;

import org.junit.Test;

import java.sql.*;

public class JDBCTest2 {

    @Test
    public void m1() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //访问一个类的静态方法时
            conn = JDBCUtils.getConnection();
            String sql = "select * from student where username = ? and  password = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "张三");
            pstmt.setString(2, "123");
//            String sql = "select * from user where user = '"+username+"' and password = '"+password+"'";
//            String sql = "select * from user where user = 'zhangsan' and password = '123'";
//            String sql = "select * from user where user = '1' or '1' = '1' and password = '123'";
//            String sql = "select * from user where user = 'a' or 'a' = 'a' and password = '123'";
//            1' or '1' = '1
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int sid = rs.getInt("stuid");
                String sname = rs.getString("sname");
                System.out.println(sid + "," + sname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, st, conn);
        }
    }
}
*/
