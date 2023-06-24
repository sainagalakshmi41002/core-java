package PQuestions;
class A{
        void meth_1(){
        System.out.println("this is class A's method"); }
        }
        class  B extends A {
        void meth_2(){
        System.out.println("this is class B's method"); }
        }
        class C extends B{
        void meth_3(){
        System.out.println("this is class C's method");}
        }
        class D extends B{
        void meth_4(){
        System.out.println("This is class D's method ");}
        }
public class New {
    public static void main(String[] args) {
        D obj=new D();
        obj.meth_1();
        obj.meth_2();
        obj.meth_4();
    }
}
