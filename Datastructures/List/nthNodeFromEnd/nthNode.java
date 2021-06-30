import java.util.*;
class LinkedList{
  Node head;
  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public LinkedList append(LinkedList list, int data){
    Node newnode = new Node(data);
    Node temp = head;
    if(list.head == null){
      list.head =newnode;
    }else{
      while(temp.right !=null){
        temp = temp.right;
      }
      newnode.left= temp;
      temp.right = newnode;
    }
    return list;
  }
  public void display(int nth){
    Node temp = head;
    while(temp.right != null){
      temp =temp.right;
    }
    while(nth!=1){
      temp =temp.left;
      nth--;
    }
    if(temp == null){
      System.out.println("There is no nth node in the list");
    }else{
      System.out.println(temp.data+" is the nth node element in the list");
    }
  }
}
    
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int data;
    int nth;
    LinkedList list = new LinkedList();
    do{
      data = sc.nextInt();
      if(data>=0){
        list= list.append(list,data);
      }
    }while(data>=0);
    System.out.println("Enter the nth node:");
    nth = sc.nextInt();
    list.display(nth);
  }
}