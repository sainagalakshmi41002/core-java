package PQuestions;

import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter below choice:");
        System.out.println("1.String to char  2.char to String");
        int choice=s.nextInt();
        if(choice ==1){
            System.out.println("enter string:");
            String str=s.next();
            char[] c=str.toCharArray();
            for(int i=0;i<c.length;i++){
                System.out.println(c[i]);
            }
        }
        else{
            System.out.println("enter char array");
            System.out.println("enter size");
             int size=s.nextInt();
            char[] c= new char[size];
             for(int i=0;i<size;i++){
                 c[i]=s.next().charAt(0);
             }
             String str1=new String(c);
            System.out.println(str1);
            String str=String.valueOf(c);
            System.out.println(str);

        }

    }
}
