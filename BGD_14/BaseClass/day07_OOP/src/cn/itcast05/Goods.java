package cn.itcast05;

//实体类 -> 实例化 -> 对象
public class Goods {

    //修饰符 类名(参数列表){
    //
    // }

    //类名 对象名 = new 构造方法名();
    public Goods(){
        //无参构造
        System.out.println("Goods的无参构造方法执行了!");
    }

    private String name;//null
    private double price;//0.0

    public String getName() {
        return name;
//        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
//        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String show() {
//        return this.name + "的价格是:" + this.price;
        return name + "的价格是:" + price+"元";
    }
}
