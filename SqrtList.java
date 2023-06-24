package Collections;

import java.util.*;

public class SqrtList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>l1=new ArrayList<>();
        System.out.println("enter the size of list:");
        java.lang.Integer n=s.nextInt();
        for(int i=0;i<n;i++){
            l1.add(s.nextInt());
        }
        System.out.println(l1);
        sqrtlist(l1);

    }
    static void sqrtlist(List<Integer> l1){
        List<Integer>l=new ArrayList<>();
        for (Integer n:l1) {
            l.add(n*n);
        }
        System.out.println(l);
    }
}
