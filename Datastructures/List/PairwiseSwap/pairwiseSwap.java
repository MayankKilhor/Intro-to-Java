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
    if(list.head == null)
    {
      list.head = newnode;
    }else{
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
    return list;
  }

  public LinkedList sort(LinkedList list){
    Node temp = list.head;
    Node index = null;
    int tempdata ;
    while(temp != null && temp.next != null){
      index = temp.next;
	  tempdata = temp.data;
      temp.data = index.data;
      index.data = tempdata;
      temp =temp.next.next;
    }
    return list;
  }
  public void display(){
    Node temp = head;
    if( head == null){
      System.out.println("List is empty");
    }else{
      
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }
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
    do
    {
        data=sc.nextInt();
        if(data>=0)
            list=list.append(list,data);
    }while(data>=0);
    list.sort(list);
    list.display();

  }
}
