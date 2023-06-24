package ArrayList;
//printing ele using for loops
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class PrintingEle {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>(List.of(2,3,1,4,5,32));
        // using normal for loop
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        // using for each loop
        //it is not mandatory to use wrapper class in for each.
        //but for each is used with wrapper class and for is used for primitives
        for (Integer n:list1) {
            System.out.print(n+" ");
        }
        System.out.println();
        //using Iterator
        Iterator<Integer> itr=list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}


