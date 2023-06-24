//Given an integer array Arr of size N the task is to
// find the count of elements whose value is greater than all of its prior elements.
//input : Arr[]={7,4,8,2,9}
//output:  3.
package Learningjava;
import java.util.Scanner;
public class ArrayGreaterEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i]=s.nextInt();
        }
        int max=a[0],count=1;
        for(int i=0;i<size;i++){
            if(a[i]>max)
                count++;
        }
        System.out.println(count);
    }
}
