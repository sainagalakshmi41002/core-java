
package Collections;

import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=s.nextInt();
        }

        int[] set = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[i] == set[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                set[count++] = numbers[i];
            }
        }

        // Print the set
        for (int i = 0; i < count; i++) {
            System.out.print(set[i] + " ");
        }
    }
}

