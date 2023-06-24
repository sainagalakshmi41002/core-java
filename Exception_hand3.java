package Learningjava;
import java.util.Scanner;
public class Exception_hand3 {
    public static void main(String[] args) throws UserdefinedException {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        int res=method1(l, b);
        System.out.println(res);
    }
    public static int method1(int a, int b) throws UserdefinedException {
        return method2(a, b);
    }
    static int method2(int a, int b) throws UserdefinedException {
        if (a < 0 || b < 0) {
            try{
                throw new UserdefinedException();
            }
                catch (UserdefinedException e) {
                System.out.println("user defined exception handeled");
                System.out.println(e);
            }
        } else {
            return a * b;
        }
        return 1;
    }
}
    class UserdefinedException extends Exception {
        @Override
        public String toString() {
            return "enter a and b values > 0";
        }
    }
