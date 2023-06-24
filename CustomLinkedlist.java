import java.util.Scanner;
public class CustomLinkedlist {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
        Scanner s = new Scanner(System.in);
        while (1 == 1)
        {
            System.out.println("1.insert 2.delete 3.display 4.reverse 5.sort 6.size");
            System.out.println("enter ur above choice:");
            int choice = s.nextInt();
            if (choice == 1)
            {
                System.out.println("1.new linked list element insert  2.insert at first " +
                        "3.insert at middle 4.insert at last");
                choice = s.nextInt();
                if (choice == 1)
                {
                    System.out.println("enter number of elements you want to insert:");
                    int size1= s.nextInt();
                    System.out.println("enter the elements: ");
                    while (size1 != 0)
                    {
                        int n = s.nextInt();
                        l.insert(n);
                        size1--;
                    }
                }
                else if (choice == 2)
                {
                    System.out.println("enter the element u want to insert at first");
                    int data = s.nextInt();
                    l.insertAtFirst(data);
                }
                else if(choice==3)
                {
                    System.out.println("enter the element u want to insert at middle and position");
                    int value=s.nextInt();
                    int pos=s.nextInt();
                    l.insertAtMiddle(value,pos);
                } else if (choice==4) {
                    System.out.println("enter element :");
                    int data=s.nextInt();
                    l.insertLast(data);
                }
            }

            else if (choice == 2)
            {
                System.out.println("1.delete at first 2.at middle 3.at last");
                choice=s.nextInt();
                if(choice==1)
                {
                    l.deleteAtfirst();
                }
                else if(choice==2)
                {
                System.out.println("enter the element u want to delete");
                int data = s.nextInt();
                l.deleteAtMiddle(data);
                }
                else if (choice==3)
                {
                    l.deleteEnd();
                }
            }
            else if(choice==3)
                l.show();
            else if (choice==4)
            {
                l.reverse();
            }
            else if (choice==5)
            {
                l.sort();
            } else if (choice==6)
            {
                System.out.println(l.size());
            }
        }
    }
}



    class Node
    {
        int data;
        Node next;
    }

    class Linkedlist {
        Node head;

        //inserts element at last if it is not empty.
        public void insert(int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (head == null)
                head = node;
            else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
               temp.next = node;
            }
        }

        public void insertAtFirst(int data)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            if (head == null)
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertAtMiddle(int value, int pos)
        {
            Node newnode = new Node();
            newnode.data = value;
            newnode.next = null;
            if (head == null)
                head = newnode;
            else
            {
                Node temp = head;
                int p = 1;
                while (p != pos - 1 && temp.next != null)
                {
                    temp = temp.next;
                    p++;
                }
                newnode.next = temp.next;
                temp.next = newnode;

            }
        }

        public void insertLast(int data) {
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = null;
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }

        public void deleteAtfirst()
        {
            if (head == null)
                return;
            else
                head = head.next;

        }

        public void deleteAtMiddle(int value)
        {
            if (head == null)
                return;
            if (head.data == value)
                head = head.next;
            else
            {
                Node current = head;
                while (current.next != null && current.next.data != value)
                    current = current.next;
                if (current.next != null)
                    current.next = current.next.next;
            }
        }

        public void deleteEnd()
        {
            if (head == null)
                return;
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }

        public void reverse()
        {
            if (head == null)
                return;
            Node previousnode = null;
            Node currentnode = head, nextnode = head;
            while (nextnode != null) {
                nextnode = currentnode.next;
                currentnode.next = previousnode;
                previousnode = currentnode;
                currentnode = nextnode;
            }
            head = previousnode;
        }

        public void sort()
        {
            Node i, j;
            int temp;
            for (i = head; i.next != null; i = i.next)
            {
                for (j = i.next; j != null; j = j.next)
                {
                    if (i.data > j.data)
                    {
                        temp = i.data;
                        i.data = j.data;
                        j.data = temp;
                    }
                }
            }
        }

        public int size()
        {
            int size = 1;
            if (head == null)
                return size;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                ++size;
            }
            return size;
        }



        public void show()
        {
            Node n = head;
            System.out.println("elements are:");
            while (n.next != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println(n.data);
        }
    }




