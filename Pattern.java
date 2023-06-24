package PQuestions;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //right triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");}
            System.out.println();
        }
        System.out.println("2ND PATTERN");

        //2nd pattern
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("3RD PATTERN");
         for(int i=1;i<=n;i++){
             for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("* ");
             }
             System.out.println();
         }
        System.out.println("4TH PATTERN");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" *");

            }
            for(int k=1;k<=i;k++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println("semi diamond");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");}
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");}
            System.out.println();

        }

        System.out.println("reverse semi diamond:");
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");}
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");}
            System.out.println();
        }

        System.out.println("full diamond");
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++)
                System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");}
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");}
            System.out.println();
        }
        System.out.println("new pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("printing pattern with alphabets");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
        System.out.println("new pattern");

        }
    }

