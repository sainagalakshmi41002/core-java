package Learningjava;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("converting string to array:");
        String str=s.next();
        char[]c=str.toCharArray();
        for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
        System.out.println("converting array to string:");
        char[]ch={'a','m','u','l','u'};
        String str1=String.valueOf(ch);
        System.out.println(str1);
        
    }
}
