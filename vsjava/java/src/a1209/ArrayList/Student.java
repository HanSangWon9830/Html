package a1209.ArrayList;

public class Student {
    private String name;
    private int age;
    private String studentid;
    
    public Student() {
    }

    public Student(String name, int age, String studentid) {
        this.name = name;
        this.age = age;
        this.studentid = studentid;
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
    public String getStudentid() {
        return studentid;
    }
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentid=" + studentid + "]";
    }
    
}