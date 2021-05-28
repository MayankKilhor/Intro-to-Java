import java.util.Scanner;
class Factors{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int i;
    for(i=1; i*i<n;i++){
      if(n%i==0){
        System.out.print(i+" "+n/i+" ");
      }
    }
    if(i*i==n){
     System.out.print(i); 
    }
    
  }
}