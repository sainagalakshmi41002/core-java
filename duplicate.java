package PQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        List l1 = new ArrayList(List.of(2, 3, 2, 3, 5, 2, 4, 2, 3, 1));
//        List l2 = new ArrayList();
//        for (int i = 0; i < l1.size(); i++) {
//            for (int j = i + 1; j < l1.size(); j++) {
//                if ((l1.get(i) == l1.get(j))) {
//                    if (!l2.contains(i)) {
//                        l2.add(l1.get(i));
//                        break;
//                    }
//                }
//            }
//
//        }
//        System.out.println(l2);
        List a=new ArrayList<>(List.of(2, 3, 2, 3, 5, 2, 4, 2, 3, 1,4));
        List d=new ArrayList<>();
        for(int i=0;i<a.size()-1;i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)==a.get(j)){
                    while(!d.contains(a.get(i))){
                        d.add(a.get(i));
                    }
                }
            }
        }
        System.out.println(d);


    }
}
