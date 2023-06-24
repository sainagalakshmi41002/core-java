package Learningjava;
class Inheritence{
    void m1(){
        System.out.println("hi");
    }
    void m2(){
        System.out.println("hello");
    }
}
class Inheritence1 extends Inheritence {
    void m2(){
        System.out.println("bye");
    }
}
public class Inheritence2 {
    public static void main(String[] args) {
          Inheritence obj= new Inheritence1();
          obj.m1();
          obj.m2();

    }
}
