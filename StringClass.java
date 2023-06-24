package Learningjava;

import java.util.Arrays;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
        String s1=new String("pallu");
        String s2=new String("pallu");
        String s3=new String(s1);;
        String s="pallu";
        String st="pallu";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s));
        System.out.println(s1==s);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String string=ss.nextLine();
        String ch= Arrays.toString(string.split(" "));
        System.out.println(ch);
    }
}
