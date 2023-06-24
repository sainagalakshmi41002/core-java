package PQuestions;

import java.util.Scanner;

public class ReplaceSpecIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter the index you want to replace:");
        int index=s.nextInt();
        System.out.println("enter the element to be inserted:");
        int val=s.nextInt();
        a[index]=val;
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
