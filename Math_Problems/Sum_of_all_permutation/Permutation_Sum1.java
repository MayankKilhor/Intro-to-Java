import java.io.*;
import java.util.*;

class Permuatation_Sum1
{
	//Sum of all possible permutations O(logn)
    static long fac(int n)
    {
        long f = 1 ;
        for(int i = n ; i>1 ; i--)
            f *= i ;
        
        return f ;
    }
    public static void main (String[] args) 
	{
        int n , temp ;
        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        sc.close();
        temp = n ;
            
        long p = 1 ;
        int a , i , sum = 0 ;
            
        for(i=0 ; i<n ; i++)
        {
            a = sc.nextInt() ;
            sum += a ;
        }
        while(--n!=0)
            p = p*10 + 1 ;
            
        System.out.print(sum*fac(temp-1)*p);
	}
}
