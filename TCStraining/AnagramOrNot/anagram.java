import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String s2 = sc.nextLine();
	    int type = 1;
	    if(s1.length() == s2.length()){
	        char[] ch1 = s1.toCharArray();
	        char[] ch2 = s2.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	        for(int i=0;i<s1.length();i++){
	            if(ch1[i]!=ch2[i]){
	                type=0;
	            }
	        }
	    }else{
	        type=0;
	    }
	    if(type==0){
	        System.out.println("Not Anagram");
	    }else{
	         System.out.println("Anagram");
	    }
	    
	}
}
