package cn.itcast01;

public class Demo2 {

    public static void main(String[] args) {

        //在本类中调用其他类的方法两种方法
        //静态方法可以直接使用类名.方法名();调用
        //非静态方法需要创建对象 通过对象名.方法名();调用

        /*Demo1.print();
        Demo1 d = new Demo1();
        d.print();*/

        /*

        方法是类中最基本的一种单元

        public static      有/无(void)          数据类型 变量名
        修饰符             返回值类型      方法名(形式参数列表){
            方法体;

            java代码;

            有返回 return 值;
            无返回 不需要return;
        }

        有参数 有返回值
        有参数 无返回值
        无参数 有返回值
        无参数 无返回值

         */
    }
}
