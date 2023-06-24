package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStringArray {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("byeee","hello","namaste"));
        Comparator<String> com=new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(list,com);
        System.out.println(list);
// sorting elemennts based on ascii
        List<Character> list1=new ArrayList<>(List.of('z','v','a','s','i'));
        Comparator<Character> cmp=new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if(o1>o2)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(list1,cmp);
        System.out.println(list1);

    }

}
