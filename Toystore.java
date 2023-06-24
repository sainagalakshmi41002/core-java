package ToyStore;
import java.util.*;
import java.util.Scanner;

class Toy{
    String toyName;
    int quantity;
    int price;
    Toy(String toyName,int quantity, int price)
    {
        this.toyName=toyName;
        this.quantity=quantity;
        this.price=price;
    }

    @Override
    public String toString()
    {
        return "\n"+"Toy name= "+toyName+"\t"+", "+
                "quantity= "+quantity+"\t"+", "+
                "price= "+price ;
    }
}
public class Toystore {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Toy toy_1 = new Toy("teddy", 1, 100);
        Toy toy_2 = new Toy("car", 10, 200);
        Toy toy_3 = new Toy("girltoy", 3, 50);
        List<Toy> Toy_list = new ArrayList<Toy>();
        Toy_list.add(toy_1);
        Toy_list.add(toy_2);
        Toy_list.add(toy_3);
        System.out.println(Toy_list);
            System.out.println("1.add a toy 2. update a toy quantity 3.deleting given toy 4.Printing the toys");
            System.out.println("Select your choice: ");
            int choice = s.nextInt();
            if(choice==1)
            {
               Toy_list = addaNewToy(Toy_list);
               System.out.println(Toy_list);
            }
            else if (choice==2)
            {
                Toy_list = updateToyQuantity(Toy_list);
                System.out.println(Toy_list);
            }
            else if(choice==3)
            {
               Toy_list = deleteAToy(Toy_list);
               System.out.println(Toy_list);
            }
            else if (choice==4)
            {
               displayToyList(Toy_list);
            }

        }

    static void displayToyList(List<Toy> toylist)
    {
        Iterator<Toy> itr = toylist.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    static List<Toy> addaNewToy(List<Toy> toyList)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Adding a new Toy ");
        System.out.println("enter toy name: ");
        String newToyName=s.next();
        System.out.println("enter toy quantity: ");
        Integer newToyQuantity=s.nextInt();
        System.out.println("enter toy price: ");
        Integer newToyPrice=s.nextInt();
        Toy newToy=new Toy(newToyName,newToyQuantity,newToyPrice);
        toyList.add(newToy);
        return toyList;
    }
    static List<Toy> updateToyQuantity(List<Toy> toylist)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the toy name that you want to update: ");
        String updateToyName = s.next();
        System.out.println("enter the new quantity: ");
        Integer newQuantity = s.nextInt();
        Iterator<Toy> itr = toylist.iterator();
        while (itr.hasNext())
        {
            Toy currentToy = itr.next();
            if (currentToy.toyName.equals(updateToyName))
                currentToy.quantity = newQuantity;
        }
            return toylist;
    }
    static List<Toy> deleteAToy(List<Toy> toylist)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the toy name to be deleted: ");
        String deleteToy=s.next();
        Iterator<Toy> itr=toylist.iterator();
        while(itr.hasNext())
        {
            if(itr.next().toyName.equalsIgnoreCase(deleteToy))
                itr.remove();
        }
        return toylist;
    }
}
