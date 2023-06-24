package PQuestions;

import java.util.Scanner;
//You have an array with n elements, find the factorial of each element  and print it.
public class FactOfN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int num=0;
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<n;i++){
        num=fact(arr[i]);
            System.out.println("fact of "+arr[i]+" is :" + num);}
    }
    public static  int fact(int a){
            if(a==1 || a==0)
                return 1;
            else{
                return (a)*fact(a-1);
        }
    }
}
