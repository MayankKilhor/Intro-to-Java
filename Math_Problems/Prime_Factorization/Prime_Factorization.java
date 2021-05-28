import java.util.Scanner;
class Prime_Factorization
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int flag;
    for(int i=2;i<=n;i++){
      if(n%i==0){
    	flag=1;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          flag=0;
          break;
        }
      }
      if(flag==1){
        
       while(n%i==0){
         n=n/i;
         System.out.print(i+" ");
       }
      }
      }
    }
  }
}