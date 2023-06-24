package Learningjava;

import java.util.Scanner;
//nested try catch blocks.
// if we write nested try block(try-catch inside try block, if the first upper try block has exception
//means the next try catch will not be executed.
public class ExceptionHand_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int c = a / b;
            try {
                int[] arr = {1, 2, 3, 4};
                arr[6] = 10;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("1st catch is executed");
            }
        }
        catch (Exception e1) {
            System.out.println(e1.getMessage());
            System.out.println("2nd catch is executed");
        }
    }
}