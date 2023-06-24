package InnerClass;
class Outer_3{
   public int a=1;
    void disp1(){System.out.println("this is a non static method of outer class" );}
    static int b=2;
    static void s_disp(){System.out.println("this is a static method of outer class");}

    class Inner{
        int a_Inner=3;
        void i_disp(){System.out.println("this is a non static method of non static inner class");}
       /* static void i_disp(){
            System.out.println("this is a  static method of non static inner class");
        } */ //not possible to create static inside non static inner class .
    }
    static class S_Inner{
        static int  aS_Inner=4;
        static void  sis_disp(){System.out.println("this is a static method of  static inner class");}
        void si_disp(){System.out.println("this is a non static method of static inner class");}
    }
}

public class StaticNonStatic {
    public static void main(String[] args) {
        System.out.println(new Outer_3().a);
        new Outer_3().disp1();
        System.out.println(Outer_3.b);
        Outer_3.s_disp();
        System.out.println(new Outer_3().new Inner().a_Inner);
        new Outer_3().new Inner().i_disp();
        System.out.println(Outer_3.S_Inner.aS_Inner);
        Outer_3.S_Inner.sis_disp();
        new Outer_3.S_Inner().si_disp();

    }
}






