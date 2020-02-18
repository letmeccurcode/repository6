package cn.itcast.tool;

public class Student {

    private Integer stuid;
    private String sname;
    private String sex;
    private String address;
    private Integer classid;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", classid=" + classid +
                '}';
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
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

    public Student() {
    }

    public Student(Integer stuid, String sname, String sex, String address, Integer classid) {
        this.stuid = stuid;
        this.sname = sname;
        this.sex = sex;
        this.address = address;
        this.classid = classid;
    }
}
