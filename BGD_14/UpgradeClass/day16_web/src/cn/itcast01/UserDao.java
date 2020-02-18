package cn.itcast01;

import cn.itcast02.User;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    @Test
    public static User queryUser(User user) {
        JdbcTemplate t = new JdbcTemplate(JDBCUtils.getDs());
        String sql = "select * from user where username = ? and password = ?";

        User result = null;
//        String sql = "select * from user where username = 'tom' and password = '123'?";
//        String sql = "select * from user where username = '"+username+"' and password = '123'?";
//        String sql = "select * from user where username = '"+username+"' and password = '"+ password+ "'";

//        String sql1 = "select * from user where username = '";
//        String sql2 = "' and password = '";
//        String sql3 = "'";
//        String sql4 = sql1 + username + sql2 + password + sql3;


        try {
            return result = t.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
        } catch (DataAccessException e) {
//            e.printStackTrace();
            return null;
        }

    }
}
