import java.util.*;
class Pappu
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=1;i<=t;i++)
    {
      int n = sc.nextInt();
      int temp =n;
      int temp2=0;
      int j=1;
      while(temp>0){
        int m = temp%10;
        if(m==6)
        {m=9;
        }
        temp2=temp2+(j*m);
        j=j*10;
        temp=temp/10;
      }
     System.out.println(temp2-n);
    }
  }
}