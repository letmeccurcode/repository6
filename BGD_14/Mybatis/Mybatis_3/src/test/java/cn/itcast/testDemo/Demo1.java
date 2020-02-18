package cn.itcast.testDemo;

import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) throws IOException {


        User u = new User(4, "jerry","123456");
        InputStream is = Resources.getResourceAsStream("MapperConfig.xml");

        SqlSession s = new SqlSessionFactoryBuilder().build(is).openSession();
        List<User> list = s.selectList("mymapper.findAll");
        System.out.println(list);

//        int i = s.insert("mymapper.save",u);
//
//        s.commit();

//        int i = s.update("mymapper.update",u);
//        s.commit();

//        int delete = s.delete("mymapper.delete", 4);
//        s.commit();
    }
}
