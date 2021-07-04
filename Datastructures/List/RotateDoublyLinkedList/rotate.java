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
  public void shift(){
    Node temp = head;
    int tempdata =  temp.data;
    while(temp.right!= null){
      temp.data= temp.right.data;
      temp =temp.right;
    }
    temp.data =tempdata;
    
  }      
  public void display(){
    Node temp = head;
    while(temp != null){
       System.out.print(temp.data + " ");
      temp =temp.right;
    }
  }
}
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int T = sc.nextInt();
    for(int i =0;i<T;i++){
      int N =sc.nextInt();
      int P = sc.nextInt();
      for(int j=0;j<N;j++){
        list.append(list,sc.nextInt());
      }
      for(int k =0;k<P;k++){
        list.shift();
      }
      list.display();
      System.out.print("\n");
      list.head =null;
    }
  }
}