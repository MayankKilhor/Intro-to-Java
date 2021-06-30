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
      	int max = 0;
        while(temp!=null)
        {
          	if(max<=temp.data){
              max=temp.data;
            }
          
            temp=temp.next;
        }
      System.out.println(max);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int data;
		do
		{
		    data=s.nextInt();
		    if(data>=0)
		        list=list.append(list,data);
		}while(data>=0);
		list.display();
		
	}
}
