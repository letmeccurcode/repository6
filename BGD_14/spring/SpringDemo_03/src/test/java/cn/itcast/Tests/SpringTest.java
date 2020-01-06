package cn.itcast.Tests;

import cn.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class SpringTest {

    @Autowired
    private UserService service;

    @Autowired
    private DataSource dataSource;

    @Test
    public void m1() throws SQLException {
        service.save();
        System.out.println(dataSource.getConnection());
    }
}
