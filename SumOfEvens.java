import java.util.*;

public class SumOfEvens {
    public static void main(String[] args) {
        int nums[]={3,2,4};
        int target=6;
        List l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    l1.add(i);
                    l1.add(j);
                }
                break;
            }
            break;
        }
        int [] a=new int[l1.size()];
        for (int i = 0; i < l1.size(); i++){
            a[i] = (int)l1.get(i);}
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
