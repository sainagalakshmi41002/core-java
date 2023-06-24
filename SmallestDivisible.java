import java.util.Scanner;
//input-1: x=33, y= 11  output- 33
// x=33 , z=can be 33 , 330,331,332..
//if z=33, where 33 is also divisible by 11(i.e y)
// input-2: x=50, y=30  output-501
// as z can be 50,500,501,502..
// 501 is divisible by 30 (i.e. y)
public class SmallestDivisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int res = 0, z = num1;
        if (z % num2 == 0)
            res = z;
        else {
            res=z;
            for (int i = 1; i < 10; i++) {
                if (i == 1) {
                    res *= 10;
                    if (res % num2 == 0)
                        break;
                }
                res += i;
                if (res % num2 == 0)
                    break;
                if (res % num2 != 0 && i != 0) {
                    res -= i;
                    continue;
                }
            }
        }
        System.out.println(res);
    }
}
