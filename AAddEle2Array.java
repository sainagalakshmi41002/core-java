package PQuestions;

import java.util.Scanner;

public class AAddEle2Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        int[] b=new int[a.length];
        b=a;
        System.out.println("the elemts of array 2:");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
