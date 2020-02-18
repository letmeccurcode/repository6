package cn.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before() {
        System.out.println("前置增强的方法执行了...");
    }

    public void after() {
        System.out.println("后置增强的方法执行了...");
    }

    public void afterException() {
        System.out.println("异常抛出了...");
    }

    public Object around(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("环绕前增强的方法执行了...");
        Object o = pdj.proceed();
        System.out.println("环绕后增强的方法执行了...");
        return o;
    }

    public void after2() {
        System.out.println("最终增强了...");
    }
}
