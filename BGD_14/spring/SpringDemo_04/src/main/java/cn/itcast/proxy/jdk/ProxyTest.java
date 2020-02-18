package cn.itcast.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        final Target t = new Target();
        Advice a = new Advice();
        TargetInterface obj = (TargetInterface) Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        a.before();
                        method.invoke(t, objects);
                        a.after();
                        return null;
                    }
                });

        obj.save();
    }
}
