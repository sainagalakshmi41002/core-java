package Learningjava;

import java.util.Scanner;

public class ArrayPassingMeth {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();
        arrayfun(a);
    }
    public static int arrayfun(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(" "+a[i]);
    return 0;
    }
}
