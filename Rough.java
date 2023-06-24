class Node1{
    int data1;
    Node1 next1;
}
class Linkedlist1{
    Node1 head1;
    public void insert(int data){
        Node1 newnode1=new Node1();
        newnode1.data1=data;
        newnode1.next1=null;
        if(head1==null)
            head1=newnode1;
        Node1 temp1=head1;
        while(temp1.next1!=null){
            temp1=temp1.next1;
        }
        temp1.next1=newnode1;
    }
    public void display(){
        if(head1==null)
            return;
        Node1 temp1=head1;
        while(temp1.next1!=null){
            System.out.println(temp1.data1);
            temp1=temp1.next1;
        }

    }

}
public class Rough {
    public static void main(String[] args) {
        Linkedlist1 l1=new Linkedlist1();
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.display();
    }
}
