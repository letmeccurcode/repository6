package cn.itcast8;

import java.util.Comparator;

public class StuComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        int num1 = s1.getName().compareTo(s2.getName());
        int num2 = (num1 == 0 ? s1.getAge() - s2.getAge() : num1);
        int num3 = (num2 == 0 ? s1.getScore() - s2.getScore() : num2);

        return num3;
    }
}
