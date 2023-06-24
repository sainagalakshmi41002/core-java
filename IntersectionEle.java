package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Finding the Intersection of Two Array Lists:
// This program will find the common elements in two array lists and store it in a third array list.
public class IntersectionEle {
    public static void main(String[] args) {
        List<String>l1=new ArrayList<>(List.of("1","pranathi","20","ongole","2023","cse","1","ongole"));
        List<String>l2=new ArrayList<>(List.of("1","vennela","20","nellore","2023","ece"));
        List<String>l3=new ArrayList<>();
//        for (String n1:l1) {
//            for(String n2:l2){
//                if(n1==n2){
//                    l3.add(n1);
//                }
//            }
//        }
//        System.out.println(l3);
        Set<String> set=new HashSet<>(l1);
        for (String s:set) {
            System.out.println(s);
        }
    }
}
