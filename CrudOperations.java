package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CrudOperations {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> al2 = new ArrayList<>(List.of(6, 7, 8, 9, 2));
        List<Integer> ll1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> ll2 = new LinkedList<>(List.of(6, 7, 8, 9, 2));
        List<Integer> l3 = new ArrayList<>();
        List<Integer> ll3 = new LinkedList<>();
        //getting the value of specified index
        for (Integer n : al1) {
            System.out.println(al1.get(al1.indexOf(n)));
        }
        //adding elements in both list
        if (al1.size() != al2.size()) {  //adding 0 to list if the size of 2 list are not same
            if (al1.size() > al2.size()) {
                for (int i = al2.size(); i <= al1.size(); i++) {
                    al2.add(0);
                }
            }
            else{
                for(int i=al1.size();i<=al2.size();i++){
                    al1.add(0);
                }
            }
        }
        for (Integer n1 : al1) {
            for (Integer n2 : al2) {
                if (al1.indexOf(n1) == al2.indexOf(n2)) {
                    l3.add(n1 + n2);
                }
            }
        }
        System.out.println(l3);
        //sub elements in both linked list
        if (al1.size() != al2.size()) {
            if (al1.size() > al2.size()) {
                for (int i = al2.size(); i <= al1.size(); i++) {
                    al2.add(0);
                }
            }
        }
        for (Integer n1 : ll1) {
            for (Integer n2 : ll2) {
                if (ll1.indexOf(n1) == ll2.indexOf(n2))
                    ll3.add(n1 - n2);
            }
        }
        System.out.println(ll3);


    }
}
