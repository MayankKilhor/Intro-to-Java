import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int num1 =0;
	    int num0 =0;
	    for(int i=0;i<n;i++){
	        if(sc.nextInt() == 0){
	            num0++;
	        }else{
	            num1++;
	        }
	    }
	    int[] arr =new int[n];
	    for(int i=0;i<num0;i++){
	        arr[i]=0;
	    }for(int i=num0;i<(num0+num1);i++){
	        arr[i]=1;
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
