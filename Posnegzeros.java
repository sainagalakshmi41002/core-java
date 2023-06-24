package PQuestions;
import java.util.Scanner;
public class Posnegzeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("enter elements");
        for (int i = 0; i < array.length; ++i) {
            array[i] = scanner.nextInt();
        }
        int[] result = countZerosNegativesPositives(array);
        int zerosCount = result[0];
        int positiveCount = result[1];
        int negativeCount = result[2];
        System.out.println(zerosCount + " " + positiveCount + " " + negativeCount);
    }

    public static int[] countZerosNegativesPositives(int[] array) {
// Write your code here
        int zerosCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zerosCount++;
            } else if (array[i] > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
       int res[]={zerosCount,positiveCount,negativeCount};
        return res;
    }
}
