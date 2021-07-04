import java.util.*;
class LinkedList
{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public LinkedList append(LinkedList list,int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(list.head==null)
            list.head=newnode;
        else
        {
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
        return list;
    }
    public void display()
    {
        Node temp=head;
      if(temp.next == null || temp == null){
         System.out.println("Deletion of second last element is not possible");
        }else{
      	while(temp.next.next.next != null){
          temp = temp.next;
        }
          temp.next = temp.next.next;
          temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    
    }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int data;
		do
		{
		    data=sc.nextInt();
		    if(data>=0)
		        list=list.append(list,data);
		}while(data>=0);
		list.display();
		
	}
}
