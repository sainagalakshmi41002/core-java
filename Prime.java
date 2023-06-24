//program to check given num is prime or not.
package Learningjava;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        System.out.println("enter num:");
        int n=s.nextInt();
        if(n==0 || n==1 )
            System.out.println("not prime");
        else if(n==2)
            System.out.println("prime");
        else{
            for(int i=2;i<n;i++) {
                if (n % i != 0) {

                }
            }
        }
    }
}