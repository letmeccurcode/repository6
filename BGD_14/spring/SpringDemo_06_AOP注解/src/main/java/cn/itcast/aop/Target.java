package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {

    public void save() {
        System.out.println("save invoke!");
//        System.out.println(10/0);
    }
}
