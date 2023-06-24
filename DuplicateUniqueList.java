package Collections;
import java.util.*;

public class DuplicateUniqueList {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(List.of(1,2,3,1,1,2,4));
        System.out.println(l1);
        HashSet<Integer> hs1=new HashSet<>();
     HashSet<Integer> hs2=new HashSet<>();
        for(Integer num:l1) {
            if (!hs1.add(num)) {
                hs2.add(num);
            }
        }
        System.out.println("unique: "+ hs1);
        System.out.println("duplicate "+hs2);
}
}

