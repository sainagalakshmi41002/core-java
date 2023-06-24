//program to print odd elements from the given array.
package Learningjava;
import java.util.Scanner;
public class OddInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] a =new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
            printOddInt(a);
    }
    public static int[] printOddInt(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(" "+a[i]);
            }
        }
       return a;
    }
}

