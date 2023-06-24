package Learningjava;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=0,n2=1;
        int count=s.nextInt();
        fib(n1,n2,count);
    }

    public static void  fib(int n1,int n2,int n){
        int n3=0;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(int i=0;i<n-2;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n2);
        }
    }
}
