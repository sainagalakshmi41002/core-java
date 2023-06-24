package CouplingClass;

public class TightCoupling_1 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        a.display();
        b.display();
    }
}

    class A {
        public void display() {
            System.out.println("A");
        }
    }

    class B {
        public void display() {
            System.out.println("B");
        }
    }



