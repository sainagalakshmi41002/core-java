import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCalss {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++){
          a[i]=s.nextInt();
      }
      int[] b=new int[size];
      for(int i=0,j=0;i<size&&j<size;i++){
         if(a[i]==0){
             b[j]=0;
             b[j++]=0;
             j++;
             continue;
         }
         else{
             b[j]=a[i];j++;continue;}
      }
        for (int i=0;i<size;i++) {
            System.out.print(b[i]+" ");
        }
        List<Integer> l=new ArrayList<>(List.of(1,2,3,4,5));
        for (Integer n:l) {
            System.out.println(n);
        }
        String str="insert";
        if(str.equalsIgnoreCase("insert"));
    }
}
