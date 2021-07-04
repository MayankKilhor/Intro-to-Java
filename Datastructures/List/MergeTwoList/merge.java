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
  public LinkedList merge(LinkedList list1 , LinkedList list2){
    Node temp = list1.head;
    if(list1.head == null){
      return list2;
    }
    if(list2.head == null){
      return list1;
    }
    while(temp.next !=null){
      temp=temp.next;
    }
    temp.next = list2.head;
    return list1;
  }
  public LinkedList sort(LinkedList list){
    Node temp = list.head;
    Node index = null;
    int tempdata ;
    while(temp != null){
      index = temp.next;
      while(index != null){
        if(temp.data > index.data){
          tempdata = temp.data;
          temp.data = index.data;
          index.data = tempdata;
        }
        index = index.next;
      }
      temp =temp.next;
    }
    return list;
  }
  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.print("NULL");
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
   	LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
   	int n1,n2,data;
    n1 = sc.nextInt();
    for(int i=0;i<n1;i++){
      data = sc.nextInt();
      list1.append(list1,data);
    }
    n2 = sc.nextInt();
    for(int i=0;i<n2;i++){
      data = sc.nextInt();
      list2.append(list2,data);
    }
    LinkedList list3 = list1.merge(list1,list2);
    list3.sort(list3);
    list3.display();

  }
}
