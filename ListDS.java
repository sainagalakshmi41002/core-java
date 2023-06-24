package Datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
List insert and delete :
input :
The first line contains an integer N,  (the initial number of elements in L).
The second line contains N  space-separated integers describing L.
The third line contains an integer, Q  (the number of queries).
The  2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
  ex: input : 5
              12 0 1 78 12
              2
              Insert
              5 23
              Delete
              0

    output:   0 1 78 12 23

 */
public class ListDS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        do{n=s.nextInt();
        }while(n<1 || n>4000);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            list.add(num);
        }
        int q;
        do{
            q=s.nextInt();
        }while(q<1 || q>4000);
        while(q>0){
            String str=s.next();
            if(str.equalsIgnoreCase("Insert")){
                int x=s.nextInt();
                int y=s.nextInt();
                list.add(x,y);
            }
            else if(str.equalsIgnoreCase("delete")){
                int x=s.nextInt();
                list.remove(x);
            }
            q--;

        }
        for(Integer num:list){System.out.print(num+" ");}

    }
}
