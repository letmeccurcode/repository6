package cn.itcast01;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateTest {

    public JDBCTemplateTest(){

    }

    public static void main(String[] args) {

//        new JDBCTemplate(JDBCUtils.getds());
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getds());

    }
}
