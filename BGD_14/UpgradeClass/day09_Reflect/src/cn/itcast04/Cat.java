package cn.itcast04;

public class Cat {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
    }

/*    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public Cat(String name) {
        this.name = name;
    }
    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String catchMouse() {
        return name + "抓到了一只jerry";
    }
}
