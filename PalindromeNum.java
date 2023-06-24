package Learningjava;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=n,rev=0;
        for(;n!=0;n/=10){
           rev=rev*10+(n%10);
        }
        if(t==rev)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
