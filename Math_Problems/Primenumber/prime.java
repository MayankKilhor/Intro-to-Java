import java.util.Scanner;
class prime
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag=1;
    for(int i=2;i<n/2;i++){
      
        if(n%i==0){
          flag=0;
          break;
        }
      }
    
      if(flag==1){
        System.out.println("Given number is a prime number");
      }else{
    System.out.println("Given number is not a prime number");
      }
  }
}