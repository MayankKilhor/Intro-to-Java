import java.util.Scanner;
class prime
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=2;i<=n;i++){
      int flag=1;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          flag=0;
          break;
        }
      }
      if(flag==1){
        System.out.print(i+" ");
      }
    }

  }
}