package cn.itcast.demo1;

public class Student {

//    属性名称必须和表的字段名一致
    private Integer sid;
    private String sname;
    private String sex;
    private String address;
    private Integer classid;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", classid=" + classid +
                '}';
    }

    public Student() {
    }

    public Student(Integer sid, String sname, String sex, String address, Integer classid) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.address = address;
        this.classid = classid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}
