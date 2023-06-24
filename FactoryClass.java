package DesignPatterns;

import java.util.Scanner;

interface Bankaccount{
    void getBankAccount();
}
class Savings implements Bankaccount
{
    @Override
    public void getBankAccount()
    {
        System.out.println("Savings accounts");
    }
}
class Current implements Bankaccount
{
@Override
      public void getBankAccount()
    {
        System.out.println("Current account");
    }

}
class FactoryExample
{
    public static Bankaccount getBankAccountmeth(String s)
    {
        if(s.equalsIgnoreCase("savings"))
            return new Savings();
        else if(s.equalsIgnoreCase("current"))
            return new Current();
        return null;
    }
}

public class FactoryClass
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Bankaccount acc=FactoryExample.getBankAccountmeth(str);
        acc.getBankAccount();

    }
}

