//for given inout a and b, need to generate fibonacci series which starts from a till b
//and need to seperate the even odd integers and print them seperately
//method-1 using (arraylist)
package Learningjava;
import java.util.*;

public class MagicSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
        int firstnum = a, secondnum = b, thirdnum=0;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (firstnum % 2 != 0) {
                odd.add(firstnum);
            } else {
                even.add(firstnum);
            }
            thirdnum=firstnum+secondnum;
            firstnum = secondnum;
            secondnum = thirdnum;

        }

        System.out.print(" "+even);
        System.out.print("");
        System.out.print(" "+odd);

    }
}
/* method-2(using array)
public class MagicSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
        int firstnum = a, secondnum = b, thirdnum=0,osize=0,esize=0;
        int[] odd=new int[10];
        int[] even=new int[10];
         for (int i = 0; i < n; i++) {
            if (firstnum % 2 != 0) {
                   odd[osize++]=firstnum;
                }
             else {
               even[esize++]=firstnum;
                }
            thirdnum=firstnum+secondnum;
            firstnum = secondnum;
            secondnum = thirdnum;

        }
        for(int i=0;i<odd.length;i++){
           System.out.print(" "+even[i]);
        }
        for(int i=0;i<odd.length;i++){
            System.out.print(" "+odd[i]);
        }
        }
        }

 */