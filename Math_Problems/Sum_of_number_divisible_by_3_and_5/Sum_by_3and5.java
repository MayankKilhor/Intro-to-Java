import java.util.*;
class Sum_by_3and5
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int m =  sc.nextInt();
    int n =  sc.nextInt();
    int sum =0;
    if(m<=n || m>0){
    for(int i=m;i<n;i++){
      if(i%3==0 && i%5==0){
        sum+=i;
      }
    }
    }
    System.out.println(sum);
  }
}