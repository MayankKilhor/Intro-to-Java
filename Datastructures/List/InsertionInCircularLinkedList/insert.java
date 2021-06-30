import java.util.*;
class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public LinkedList append(LinkedList list, int data){
    Node newnode = new Node(data);
    Node temp = head;
    if(list.head == null){
     	list.head = newnode;
      	newnode.next = list.head;
    }else{
      while(temp.next!=list.head){
        temp = temp.next;
      }
      temp.next = newnode;
      newnode.next = list.head;
    }
    return list;
  }
  public void display(LinkedList list){
    Node temp = list.head;
    while(temp.next!=list.head){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.print(temp.data);
  }
}
      
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int data;
    int type;
    LinkedList list = new LinkedList();
    do{
      data=sc.nextInt();
      type=sc.nextInt();
     if(type==1)
          {
		    if(data>=0)
		        list=list.append(list,data);
          }else
          {
		        list=list.append(list,data);
            	break;
          }
    }while(data >=0);
    list.display(list);
  }
}