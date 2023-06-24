//mall has RxC number of parking spaces.
// Each parking space will either be  empty(0) or full(1).
//The task is to find index of the row in the parking lot that has
// the most of the parking spaces full(1)
//input:[0 1 0]
  //      [1 1 0]
//        [1 1 1]
package Learningjava;
import java.util.Scanner;
public class ParkingSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int a[][]=new int[row][col];
        int rcount=0,max=0,res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rcount+=a[i][j];
                if(max<rcount){
                    max=rcount;
                    res=i;
                }
            }
            rcount=0;
        }
        System.out.println(res+1);
    }
}
