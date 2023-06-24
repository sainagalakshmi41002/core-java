package Learningjava;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int t=num,count=0,rem,result=0,c;
        for(;num!=0;num/=10)
            count++;
        num=t;c=count;
        for(;num!=0;num/=10){
            rem=num%10;
            int res=1;
            count=c;
            while(count!=0){
                res=rem*res;
                count--;}
            result+=res;

        }
        if(result==t)
            System.out.println("yes");
        else
            System.out.println("no");
        }

    }
