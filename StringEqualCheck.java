//program to check if 2 strings equal or not.
package Learningjava;
import java.util.*;
public class StringEqualCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        boolean b= true;
        if(str1.length()!=str2.length()){
        b=false;
        }
        else{
        for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(i)){
        b=false;
        }
        }
        }
        if(b==true)
        System.out.println("Both are same");
        else
        System.out.println("Not same");
    }
}
/* method -2 (easy one)
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        boolean b= true;
   if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    if (i == str1.length() - 1) {
                        System.out.println("Same");
                        break;
                    }
                    continue;
                } else {
                    System.out.println("Not same");
                    break;

                }
            }
        }
        else
            System.out.println("not same");
    }
}

 */
