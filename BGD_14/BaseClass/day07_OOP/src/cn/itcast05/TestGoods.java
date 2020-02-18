package cn.itcast05;

public class TestGoods {

    public static void main(String[] args) {

        Goods goods = new Goods();
        //调用构造方法 1 实例化该对象 2 给该对象的属性赋初始值

//        String s = goods.show();
//        System.out.println(s);

        goods.setName("营养快线");
        goods.setPrice(3.5);

        System.out.println(goods.show());
    }
}
