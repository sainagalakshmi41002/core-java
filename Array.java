import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        do {
            size = s.nextInt();
        } while (size < 1 || size > 500);
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=s.nextInt();
        }
        int num=0,digCount ,count=0;
        for(int i=0;i<size;i++){
            digCount=0;
            num=nums[i];
            while(num!=0){
                num/=10;
                digCount++;
            }
            if(digCount%2==0)
                count++;
        }
        System.out.println(count);
    }
}
