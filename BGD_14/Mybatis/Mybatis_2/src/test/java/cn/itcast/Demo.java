package cn.itcast;

import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo {

    @Test
    public void m1() throws IOException {
        InputStream stream = Resources.getResourceAsStream("MapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = build.openSession();
        List<User> list = session.selectList("usermapper.findAll");
        System.out.println(list);
    }
}
