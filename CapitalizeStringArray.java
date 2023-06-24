package PQuestions;
import java.util.Locale;
import java.util.Scanner;

public class CapitalizeStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str="this is java code";
        String firstletter,remainingletter,capitalize="";
        String[] word=str.split(" ");
//        System.out.print(str.length());
        for(int i=0;i<word.length;i++){
            firstletter=word[i].substring(0,1);
            remainingletter=word[i].substring(1);
            capitalize+=firstletter.toUpperCase()+remainingletter+" ";
        }
        System.out.print(capitalize);

    }

    }
