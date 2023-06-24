import java.util.*;
class NameCheck {
    void check() {
        Scanner s = new Scanner(System.in);
        String names = s.next();
        boolean isName = false;
        for (int i = 0; i < names.length(); i++) {
            System.out.println((char)(i));
//            if ((names.charAt(i) < 65) && (names.charAt(i) > 91))
//                System.out.println((int) names.charAt(i));
//            else
//                isName=true;
//        }
//        if(isName)
//            System.out.println("valid");
//        else
//            System.out.println("invalid");
        }
    }
}
public class ExceptionClass1 {
    public static void main(String[] args) {
   NameCheck obj=new NameCheck();
   obj.check();
    }
}
