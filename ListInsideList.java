package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInsideList {
    public static void main(String[] args) {
      List<List> outer=new ArrayList<>();
      List inner1=new ArrayList<>();
      inner1.add(1);
      inner1.add("Pranathi");
      inner1.add(20);
      inner1.add("Ongole");
      outer.add(inner1);
      List inner2=new ArrayList();
      inner2.add(2);
      inner2.add("Vennela");
      inner2.add(20);
      inner2.add("Nellore");
      outer.add(inner2);
        System.out.println(outer);
    }
}
