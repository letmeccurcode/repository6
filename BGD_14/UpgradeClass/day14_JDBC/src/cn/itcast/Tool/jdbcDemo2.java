package cn.itcast.Tool;

import java.sql.*;

/*
练习目的:学会使用工具类来进行完成JDBC的使用.  最基础
工具类:jdbcUtil
*/
public class jdbcDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement sta = null;
        ResultSet rs = null;
        try {
            conn = jdbcUtil.getConnection();
            String sql = "SELECT *FROM USER WHERE username=? AND password=?";
            sta = conn.prepareStatement(sql);
            sta.setString(1, "ZHANGSAN");
            sta.setString(2, "123456");
            rs = sta.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("USERID");
                int age = rs.getInt("AGE");
                System.out.println(i + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil.getClose(rs, sta, conn);
        }

    }


}
