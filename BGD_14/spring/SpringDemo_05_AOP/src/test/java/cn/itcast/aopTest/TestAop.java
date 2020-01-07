package cn.itcast.aopTest;

import cn.itcast.aop.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class TestAop {

    @Autowired
    private Target target;

    @Test
    public void m1() {
//        new ArrayList<>()
        target.save();
    }
}
