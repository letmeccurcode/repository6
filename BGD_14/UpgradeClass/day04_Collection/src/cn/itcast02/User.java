package cn.itcast02;

public class User implements Comparable<User>{

    private String name;
    private int age;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    /**
     * 用来指定User对象在集合中的排序规则
     * @param
     * @return 正数 升序 / 负数 降序 / 0 重复 不添加
     */
    @Override
    public int compareTo(User user) {
        String sname1 = this.name;
        String sname2 = user.getName();

        int sage1 = this.age;
        int sage2 = user.getAge();

        String pswd1 = this.password;
        String pswd2 = user.getPassword();

        //jerry     4       321

        //tom       5       123
        //tom       5       321

        int num1 = sname1.compareTo(sname2);  // num1 = 0
        int num2 = (num1 == 0 ? sage1 - sage2 : num1); //num2 = 0
        int num3 = (num2 == 0 ? pswd1.compareTo(pswd2) : num2); //num3 = 1
        return num3;
    }
}
