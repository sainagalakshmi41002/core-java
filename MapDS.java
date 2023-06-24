package Datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String,Integer> pbook=new HashMap<>();
        int n ;
        do{
            n=Integer.parseInt(s.nextLine());
        }while(n<1 || n>100000);
        while(n>0){
            String name=s.nextLine();
            int pnum = Integer.parseInt(s.nextLine());
            pbook.put(name,pnum);
            n--;
        }
        while (s.hasNextLine()) {
            String str=s.nextLine();
            if(pbook.containsKey(str))
            {
                System.out.println(str+"="+pbook.get(str));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
