package Learningjava;
/*when we create an obj to child clss n passed value in const, the child class parameterized const
will be called. in case of calling parent class parameterized constructor , we use super(parameter)
in child class  */
class Parent{
    int a=10;
    public Parent(){
        System.out.println("this is parent class non para constructor");
    }
    public Parent(int x){
        System.out.println("this is parent class para constructor"+x);
    }
}
class Child extends Parent{
    int a=20;
    public Child(){
        System.out.println("this is child class non para constructor");
    }
    public Child(int x){
        System.out.println("this is child class para constructor"+" "+x);
    }
    public Child(int x,int y){
        super(x);
        System.out.println("2 param of child");
    }
    public void meth(){
        System.out.println(super.a);
        System.out.println(a);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child(2,3);
        obj.meth();
    }
}

