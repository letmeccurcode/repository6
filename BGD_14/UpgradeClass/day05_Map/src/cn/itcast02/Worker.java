package cn.itcast02;

public class Worker {

    private String name;
    private int age;
    private double salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Worker(String name, int age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Worker() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Worker [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
    }
    public void work(){
        System.out.println(name+"正在工作~~");
    }
}
