package Learningjava;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                if(k==1 || k==i+2)
                    System.out.print(i);
                else{
                    int c=i;
                    System.out.print(++c);
                }
            }
            System.out.println();
        }
    }
}
