import java.util.Arrays;
class Student {
    private int rollnum;
    private String name;
    private String dept;
    private String[] subs;
    public Student(int rollnum,String name,String dept,String[] subs){
        this.rollnum=rollnum;
        this.name=name;
        this.dept=dept;
        this.subs=subs;
    }
//    public int getRollnum() {return rollnum;}
//    public String getName() {return name;}
//    public String getDept() {return dept;}
//    public String[] getSubs() {return subs;}
//    public void setDept(String dept) {
//         this.dept = dept;
//     }
//     public void setSubs(String...subs) {
//         this.subs = subs;
// }
    @Override
    public String toString() {
        return "Student{" +
                "rollnum=" + rollnum +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", subs=" + Arrays.toString(subs) +
                '}';
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        s[0] = new Student(1, "pranathi", "cse", new String[]{"os", "c"});
        s[1] = new Student(2, "vennela", "ece", new String[]{"bee", "scp"});
        s[2] = new Student(3, "likitha", "cse", new String[]{"c", "dbms"});
        for (Student stu : s) {
            System.out.println(stu.toString());
        }
    }
}