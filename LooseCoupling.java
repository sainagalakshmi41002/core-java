package CouplingClass;

interface Calculation{
    void do_calc(String calculation);
}
class Add implements Calculation{
    public void do_calc(String calculation){
        System.out.println(calculation);
    }
}
class Sub implements Calculation{
    public void do_calc(String calculation){
        System.out.println(calculation);
    }
}
class Operation{
    private Calculation calc;
    Operation(Calculation calc){
        this.calc=calc;
    }
    public void do_calc(String calculation){
        calc.do_calc(calculation);
    }

}
public class LooseCoupling {
    public static void main(String[] args) {
        Calculation c1=new Add();
        c1.do_calc("add");
        Calculation c2=new Sub();
        c2.do_calc("sub");

    }
}


/*
The Operation class is used to demonstrate loose coupling in the program. The purpose of the Operation class is to perform some operation,
 in this case, a calculation, without knowing the details of how the calculation is actually performed. The Operation class is loosely
 coupled to the actual calculation because it uses the Calculation interface and its implementations Add and Sub instead of directly using
  the actual calculation classes.
  The private Calculation calc variable is of type Calculation and is used to store a reference to an instance of a class that
  implements the Calculation interface. This allows the Operation class to work with any implementation of the Calculation interface.

The Operation class takes an instance of Calculation as a parameter to its constructor and stores it in the calc variable.
Then, when the do_calc method is called, it simply delegates the call to the calc.do_calc(calculation) method, which is implemented
 by the actual calculation class.

This demonstrates loose coupling because the Operation class does not depend on a specific implementation of the Calculation interface.
 It can be used with any implementation without having to modify the code. The Calculation interface provides a level of abstraction
 that decouples the Operation class from the actual calculation implementation.

 */

/*
Here's how the control works in the program:
The main method creates two instances of the Calculation interface, c1 and c2. c1 is an instance of Add and c2 is an instance of Sub.
The main method then calls the do_calc method on c1 and c2 with the argument "add" and "sub" respectively.

The do_calc method in the Add class implementation of Calculation is executed for c1 and it prints "add".
Similarly, the do_calc method in the Sub class implementation of Calculation is executed for c2 and it prints "sub".

This demonstrates that the Operation class is loosely coupled to the specific implementation of the Calculation interface
and can be used with any implementation without having to modify the code.
 */
