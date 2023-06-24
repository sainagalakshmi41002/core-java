import java.util.Arrays;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private float salary;
    private String adress;
    private String[] projects;
    Employee(String name, int id, float salary, String adress, String... projects) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.adress = adress;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", adress='" + adress + '\'' +
                ", projects=" + Arrays.toString(projects) +
                '}';
    }
}
public class ArrayOfEmployee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num of employees:");
        int n=s.nextInt();
    Employee[] obj=new Employee[n];
    for(int i=0;i<n;i++){
        System.out.println("enter name,id,salary,adress,projects for emp"+i);
        String name=s.next();
        int id=s.nextInt();
        float salary=s.nextFloat();
        String adress=s.next();
        System.out.println("enter no of projects");
        int nproj=s.nextInt();
        String[] projects=new String[nproj];
        for(int j=0;j<nproj;j++){
            projects[j]=s.next();
        }
        obj[i]=new Employee(name,id,salary,adress,projects);
    }
    for(int i=0;i<n;i++)
        System.out.println(obj[i].toString());
    }
}
