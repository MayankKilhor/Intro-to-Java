import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
class LinkedList{
  Node head;
  
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
  public Node sorted(Node l1, Node l2){
    if(l1 == null){
      return l2;
    }if(l2 == null){
      return l1;
    }
    Node temp = new Node(-1);
    Node head = temp;
    while (l1 != null && l2 != null) {

			if (l1.data < l2.data) {

				temp.next = l1;
				temp = temp.next;
				l1 = l1.next;
			}

			else {

				temp.next = l2;
				temp = temp.next;
				l2 = l2.next;
			}
		}

		while (l2 != null) {

			temp.next = l2;
			temp = temp.next;
			l2 = l2.next;
		}

		while (l1 != null) {

			temp.next = l1;
			temp = temp.next;
			l1 = l1.next;
		}

		return head.next;
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
    Node ans = list1.sorted(list1.head, list2.head);

	Node temp = ans;
    while (temp != null) {

        System.out.print(temp.data + "->");
        temp = temp.next;
    }

    System.out.print("NULL");
  

  }
}
