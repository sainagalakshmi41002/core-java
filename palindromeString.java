package Learningjava;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String rev="";
        for(int i=s1.length()-1;i>=0;i--)
            rev+=s1.charAt(i);
        if(s1.equals(rev))
            System.out.println("same");
        else
            System.out.println("not same");

    }
}
