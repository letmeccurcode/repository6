package cn.itcast02;

public class B extends A{

    public int num = 20;

    public void show(){
        int num = 30;
        System.out.println(num);//30

        System.out.println(this.num);//20

        System.out.println(super.num);//10
        //先从局部范围开始找 -> 去当前类的成员范围找 -> 去父类的成员范围找

//        this 是一个引用类型 保存了当前对象的内存地址值
//        super只是一个普通的关键字 是用来访问父类中成员的一种方式
    }

    public  void show2(){
        System.out.println(this);//
//        System.out.println(super);
    }

    public B(){
//        super();
        super(40);
        System.out.println("B的无参构造方法执行了");
    }

    public void m1(){
        System.out.println("B类中的m1方法执行了");
    }

    public void m2(){
//        this.m1();
        //子父类中有同名的成员方法时如何区分调用? this.调用当前类的成员方法  super.调用父类中的成员方法
        m1();
        super.m1();
    }
}
