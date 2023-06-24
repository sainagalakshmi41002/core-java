package Learningjava;
public class thiskey {
    public static void main(String[] args) {
        A y=new A();
        y.m1();
        y.m2();
        y.print();
    }
    public static class A{
            int a;
            void m1(){
                int a=100;
                this.a=a;
                System.out.println(a);
                System.out.println(this.a);
            }
            void m2(){
                int b=20;
                this.a=b;
                System.out.println(a);
                System.out.println(this.a);
            }
            void print(){System.out.println(this.a);}
        }
    }
