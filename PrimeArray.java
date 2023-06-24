package Learningjava;
import java.util.Scanner;
public class PrimeArray {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int size=s.nextInt();
            int[] a=new int[size];
            for(int i=0;i<size;i++)
            {
                a[i]=s.nextInt();
            }
            boolean isPrime=true;
            for(int i=0;i<size;i++){
                if(a[i]==0 || a[i]==1)
                    isPrime=false;
                else{
                    for(int j=2;j<a[i];j++){
                        if(a[i]%j==0){
                            isPrime=false;
                           break;
                        }
                        else
                            isPrime=true;
                    }
                }
                if(isPrime)
                    System.out.println(a[i]+" is a prime number");
                else
                    System.out.println(a[i]+" is not a prime number");
                }
            }
}
