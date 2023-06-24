package Learningjava;
class New{
    int age;
    String a;

    public void info(int age,String a){
        this.age=age;
        this.a=a;
        System.out.println(age+" "+a);
    }
    public void info(int age){
        this.age=age;
        System.out.println(age);
    }
}
public class MethOverload {
    public static void main(String[] args) {
     New obj=new New();
     obj.info(5);
     obj.info(5,"heyy");
    }
}
