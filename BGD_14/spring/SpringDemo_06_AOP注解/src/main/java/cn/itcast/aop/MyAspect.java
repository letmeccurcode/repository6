package cn.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect //标准当前Aspect是一个切面类
public class MyAspect {

    //    @Before("execution(* cn.itcast.aop.*.*(..))")
    public void before() {
        System.out.println("前置增强的方法执行了...");
    }

    public void after() {
        System.out.println("后置增强的方法执行了...");
    }

    public void afterException() {
        System.out.println("异常抛出了...");
    }

    //    @Around("execution(* cn.itcast.aop.*.*(..))")
    @Around("m()")
    public Object around(ProceedingJoinPoint pdj) throws Throwable {
        System.out.println("环绕前增强的方法执行了...");
        Object o = pdj.proceed();
        System.out.println("环绕后增强的方法执行了...");
        return o;
    }

    //    @After("execution(* cn.itcast.aop.*.*(..))")
    @After("m()")
    public void after2() {
        System.out.println("最终增强了...");
    }

    @Pointcut("execution(* cn.itcast.aop.*.*(..))")
    public void m() {

    }
}
