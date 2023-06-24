package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArrayList {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2=new ArrayList<>(List.of(6,7,8,9,10));
        List<Integer>res=new ArrayList<>();
        for (Integer n1:list1)
        {
            for (Integer n2:list2) {
                if(list1.indexOf(n1)==list2.indexOf(n2))
                    res.add(n1+n2);
            }
        }
        System.out.println(res);
    }
}
