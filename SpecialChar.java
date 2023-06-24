package PQuestions;

import java.util.Scanner;

public class SpecialChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean bool=true;
        char[]c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(((c[i]>=97 && c[i]<=122)|| (c[i]>=65 && c[i]<=90)|| (c[i]>=48 && c[i]<=57)))
                bool=true;
            else
                bool=false;
        }
        if(bool)
            System.out.println("no special char");
        else
            System.out.println("special char found");


    }
}
