package cn.itcast01;

import java.io.Serializable;

//为了学习后面javaweb的session对象
//钝化 和 活化
//序列化 和 反序列化

public class User implements Serializable {

    private static final long serialVersionUID = 4476657295757562867L;

    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    //    private transient int age;
}
