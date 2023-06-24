package InnerClass;

public class StaticClass {
    public static void main(String[] args) {
        //for accessing non-static inner class
     new Outer_2().new Inner_2a().disInner_2a();


     //for accessing static inner class
        Outer_2.Inner_2 obj1= new Outer_2.Inner_2();

    }
}
class Outer_2{
    class Inner_2a{
        void disInner_2a(){
            System.out.println("this is a a method non static inner class ");
        }
    }
    static class Inner_2{
        void disInner_2(){
            System.out.println("this is a method of static inner class");
        }
    }
}

