package Collections;
import java.util.*;
//WAP to remove element from specified index of ArrayList
public class RemoveElementIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1.linked list 2.Arraylist");
        int choice=(Integer) s.nextInt();
        if(choice==1) {
            List<Object> l1 = new ArrayList<>();
            l1.add(1);
            l1.add("hi");
            l1.add("namaste");
            l1.add(0);
            System.out.println("before removing:" + " " + l1);
            System.out.println("enter specific");
            int n = s.nextInt();
            l1.remove(l1.get(n));
            System.out.println("after removing" + " " + l1);
        }
        else if(choice==2){
            List<Object>l1 = new LinkedList<>();
            l1.add(1);
            l1.add("hi");
            l1.add("namaste");
            l1.add(0);
            System.out.println("before removing:" + " " + l1);
            System.out.println("enter index");
            int n = s.nextInt();
            l1.remove(l1.get(n));
            System.out.println("after removing" + " " + l1);
            System.out.println("total size:"+l1.size());
            System.out.println("enter index:");
            n=s.nextInt();
            System.out.println("enter element u want to insert");
            int value=s.nextInt();
            l1.set(n,value);
            System.out.println(l1);
        }

    }
}
