package ArrayList;

import java.util.ArrayList;
import java.util.List;

//Creating a Reverse List : creates a new reverse Arraylistof original arraylist.
public class ReverseList {
    public static void main(String[] args) {
        List<String> old=new ArrayList<>(List.of("hi","pranathi","20","ongole","bye"));
        List<Object> reverse=new ArrayList<>(old.size());
        for(int i = old.size()-1; i>=0; i--){
            reverse.add(old.get(i));}
        System.out.println(reverse);

    }
}
