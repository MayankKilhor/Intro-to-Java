import java.util.Scanner;
class GCD_LCM
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x=a,y=b;
    int temp;
    while(y!=0){
      temp=y;
      y=x%y;
      x=temp;
    }
    sc.close();
    System.out.println(x);
    System.out.println((a*b)/x);
  }
}