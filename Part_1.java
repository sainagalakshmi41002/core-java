package Collections;
import java.util.*;
//creating a collection
//size is not mandatory
//Write a Java program to iterate through all elements in a array list
//3 types of for each
public class Part_1 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(30);
        l1.add(4);
        l1.add(5);
        java.lang.Integer max=0;
        for (Integer num:l1) {
           if(max<num)
               max=num;
        }
        System.out.println(max);

        /*
        List l2=new ArrayList<>();
        l2.add(1);
        l2.add(2.3);
        l2.add('c');
        l2.add("string");
        l2.add(false);
        l2.forEach((n)-> System.out.println(n));

*/




    }
}
