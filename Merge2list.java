package Collections;

import java.util.*;

public class Merge2list {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(List.of(1,2,3,4));
        List<Integer> l2=new ArrayList<>(List.of(5,6,7));
        l1.addAll(l2);
        System.out.println(l1);
        Collections.addAll(l2,2,3,4);
        System.out.println(l2);
    }
}
