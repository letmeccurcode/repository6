package cn.itcast7;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
        String sname = s.getName();
        int sage = s.getAge();
        int sScore = s.getScore();

        int num1 = this.name.compareTo(sname);
        int num2 = (num1 == 0 ? this.age - sage : num1);
        int num3 = (num2 == 0 ? this.score - sScore : num2);
        return num3;
    }
}
