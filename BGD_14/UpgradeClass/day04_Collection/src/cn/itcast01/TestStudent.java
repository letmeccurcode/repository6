package cn.itcast01;

import java.util.*;

public class TestStudent {

    public static void main(String[] args) {

//        Collection<Student> list = new ArrayList<Student>();
        List<Student> list = new ArrayList<Student>();

        Student zs = new Student("张三", 23);
        Student ls = new Student("李四", 24);
        Student ww = new Student("王五", 25);

        list.add(zs);
        list.add(ls);
        list.add(ww);

//        <泛型约束>
        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
//            System.out.println(it.next().getName());
//            System.out.println(it.next().getAge());

            Student stu = it.next();
            System.out.println(stu.getName() + ":" + stu.getAge());

            //while循环体中一次只能取出一个元素 next方法每执行一次 游标都会乡下移动一位 取出新的元素
        }

        for (int i = 0; i < list.size(); i++) {

            //根据索引获取对应位置的元素是List接口特有的方法 可以使用带索引的for循环对List接口的自实现类进行遍历
            //list.get(i);
        }

        ListIterator<Student> listitr = list.listIterator();

        while (listitr.hasNext()) {
            Student stu = listitr.next();
            System.out.println(stu.getName());
        }

        while (listitr.hasPrevious()) {
            Student stu = listitr.previous();
            //该循环是逆向遍历集合
        }

        // 1 使用for循环对集合进行遍历 使用集合对象添加元素
        // 2 使用列表迭代器对集合进行遍历 使用列表迭代器对象的添加方法添加元素
    }
}
