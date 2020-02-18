package cn.itcast.proxy.cglib;

import cn.itcast.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        final Target t = new Target();
        final Advice a = new Advice();

        //创建增强器
        Enhancer e = new Enhancer();
        //设置父类
        e.setSuperclass(Target.class);
        //设置回调
        e.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                a.before();
                Object result = method.invoke(t, args);
                a.after();
                return result;
            }
        });
        //创建代理对象
        Target tar = (Target) e.create();
        tar.save();
    }
}
