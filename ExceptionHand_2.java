package Learningjava;
import java.util.Scanner;

//creating user-defined exceptions
class UserdefinedException1  extends Exception {
public String toString(){
    return "The amount you haev entered is > 5k.Please enter amount <5k.";
    }
}
class ExceptionHand_2 {
    public static void main(String[]args) {
        Scanner s=new Scanner(System.in);
        int withdrawl=s.nextInt();
        if(withdrawl>5000){
            try{
                throw new UserdefinedException1();
            } catch (UserdefinedException1 e) {
                System.out.println("exception is caught");
                System.out.println(e);
            }
        }
        else{
            System.out.println("the amount is withdrawl succesfully");
        }
        }
}