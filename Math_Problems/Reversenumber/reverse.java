import java.util.Scanner;
class reverse
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp=0,i=10;
    while(n>0){
      temp=temp*i+(n%10);
      n=n/10;
    }
    System.out.println(temp);
  }
}