package cn.itcast.tool;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JDBCTemplateTest {

    JdbcTemplate t = new JdbcTemplate(JDBCUtils.getDs());

    @Test
    public void m1() {
//        String sql = "insert into student(stuid,sname) values(null,?) ";
        String sql = "insert into student values(null,?,?,?,?) ";
        int i = t.update(sql, "田七", "男", "广西南宁", 2);
        System.out.println(i);
    }

    @Test
    public void m2() {
//        如果表记录要封装成实体类对象 必须先声明一个类
        String sql = "select * from student where stuid = ?";
        //底层是用到了反射技术
        List<Student> list = t.query(sql, new BeanPropertyRowMapper<Student>(Student.class),1);
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
