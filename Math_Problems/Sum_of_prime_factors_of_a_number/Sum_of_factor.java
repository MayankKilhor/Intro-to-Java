import java.util.Scanner;
class Sum_of_factor
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0,flag;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        flag=1;
        for(int j=2;j<=i/2;j++){
          if(i%j==0){
            flag=0;
            break;
          }
        }
        if(flag==1){
          sum+=i;
        }
      }
    }     
    System.out.println(sum-1);
    sc.close();
  }
}