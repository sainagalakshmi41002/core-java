import java.util.*;
    public class Solution {
        public static void main(String args[] ) throws Exception {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            Scanner scanner=new Scanner(System.in);
//            int size=s.nextInt();
//            String str=s.nextLine();
//            Integer [] a =new Integer[size];
//            for(int i=0;i<size;i++){
//                a[i]=s.nextInt();
//            }
            if (scanner.hasNextInt()) {
                System.out.println("enter array size");
                int size=scanner.nextInt();
                int[] a=new int[size];
                System.out.println("enter array elements of sizze:"+size);
                for(int i=0;i<size;i++){a[i]=scanner.nextInt();}
                System.out.println(sum(a));
            }

            else if(scanner.hasNext()){
                System.out.println("enter string ");
                String str=scanner.nextLine();
            System.out.println(sum(str));}

        }
        public static Integer sum(int[] ints){
            Integer sum=0;
            while(ints.length>=1 && ints.length<=100){
                for(Integer i=0;i<ints.length;i++){
                    sum+=ints[i];
                }
                break;
            }
            return sum;
        }
        public static String sum(String s){
            String n="";
            char [] c=s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i] == ' ')
                    continue;
                n+=c[i];
            }
            return n;
        }
    }