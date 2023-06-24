package Learningjava;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean bool=false;
        if(n%2==0)
            bool=false;
        else{
            for(int i=2;i<(n/2+1);i++){
                if(n%i==0){
                    bool=false;
                    break;}
                else{
                    bool=true;
                }
            }
        }
        if(bool==true)
            System.out.println(n+ "is a prime num");
        else
            System.out.println(n+ " is not a prime num");
    }
}
