package cn.itcast04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCat {

    Class<?> catClass;
    @Before
    public void loadClass(){
        try {
              catClass = Class.forName("cn.itcast04.Cat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //单元测试
    @Test
    public void testCon() {
        try {
            //获取构造方法对象
            Constructor<?> catcon = catClass.getDeclaredConstructor(String.class, int.class);

            //取消java语言权限检查
            catcon.setAccessible(true);

            //使用构造方法对象实例化
            Cat cat = (Cat) catcon.newInstance("妞妞", 12);
            System.out.println(cat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMethod() {
        try {
            Constructor<?> cat = catClass.getDeclaredConstructor(String.class);
            Cat c = (Cat) cat.newInstance("tom");
            //获取成员方法对象
            Method catchMouse = catClass.getDeclaredMethod("catchMouse");

            catchMouse.setAccessible(true);
            //执行该方法
            Object result = catchMouse.invoke(c);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testField() {
        try {
            Constructor<?> cat = catClass.getDeclaredConstructor(String.class);
            Cat c = (Cat) cat.newInstance("tom");
            //获取属性对象
            Field age = catClass.getDeclaredField("age");
            age.setAccessible(true);
            //给age属性赋值
            age.set(c, 12);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void finallyMethod(){
        System.out.println("所有的测试方法都执行完毕了");
    }
}
