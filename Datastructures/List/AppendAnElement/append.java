import java.util.*;
class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public LinkedList append(LinkedList list , int data){
    Node newnode = new Node(data);
    Node temp = head;
    if(list.head == null){
      list.head = newnode;
    }else{
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
    return list;
  }
  public void duplicate(){
    Node temp1,temp2,p;
        temp1=head;
        while(temp1!=null)
        {
            temp2=temp1.next;
            p=temp1;
            while(temp2!=null)
            {
                if(temp1.data==temp2.data)
                {
                    p.next=temp2.next;
                    temp2.next=null;
                    temp2=p.next;
                }else{
                    temp2=temp2.next;
                    p=p.next;
                }
            }
            temp1=temp1.next;
        }
    }
  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int data;
    int c = 0;
    do
    {
        data=sc.nextInt();
        if(data>=0){
            list=list.append(list,data);
          c++;
        }	
    }while(data>=0);
    if(c == 0){
      System.out.println("List is empty");
    }else{
    list.duplicate();
    list.display();
    }

  }
}