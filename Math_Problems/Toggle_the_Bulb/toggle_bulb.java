import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int[] a= new int[n];
    for(int i=0;i<n;i++){
      a[i]=1;
    }
    for(int i=1;i<n-1;i++){
      for(int j=i;j<n;j=j+i+1){
        if(a[j]==0){
          a[j]=1;
    }else{a[j]=0;}
      }
    }
	if(a[n-1]==0){
      a[n-1]=1;
    }else{
      a[n-1]=0;
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==1){
        sum+=1;
      }
    }
    System.out.println(sum);
  }
}