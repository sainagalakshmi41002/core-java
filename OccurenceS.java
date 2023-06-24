package PQuestions;
import java.util.Scanner;

public class OccurenceS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("enter element to be found:");
        char ch=s.next().charAt(0);
      //  char Uch=ch
        int count=0;
        char[]c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==ch){count++;}
        }
        System.out.println("occurrences of 's' is: "+count);
        }
    }

