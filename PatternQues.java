package Learningjava;

import java.util.Scanner;

public class PatternQues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int size=n-1;
        for (int i = 0; i<n+1;i++) {
            for(int j=0;j<(2*n)-1;j++){
                if((j==size-i) || (j==size+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
