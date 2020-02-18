package cn.itcast02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private int age;
    private Date birth;

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Student(String name, int age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + parseDate() +
                '}';
    }

    //作用:把成员变量的Date变成String的日期
    public String parseDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = sdf.format(birth);
        return birthday;
    }
}
