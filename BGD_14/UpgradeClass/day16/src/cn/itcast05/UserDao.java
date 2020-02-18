package cn.itcast05;

import cn.itcast06.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    //查询数据库中是否存在用户名和密码
    public static User findUser(User user) {

        User result = null;
        try {
            JdbcTemplate t = new JdbcTemplate(JDBCUtils.getds());

            String username = user.getUsername();
            String password = user.getPassword();

//            String sql = "select * from user where ? = ? and password = ?";
            String sql = "select * from user where username = ? and password = ?";

//            result = t.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),"username", username, password);
            result = t.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return result;
        } catch (DataAccessException e) {
//            e.printStackTrace();
        }
        return result;
    }
}
