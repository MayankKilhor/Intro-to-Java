import java.util.*;
 
public class Main {
      
    public static boolean areBracketsBalanced(String expr) {
      
        Stack<Character> stack= new Stack<>();
 
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
               
                stack.push(x);
                continue;
            }
 
            if (stack.isEmpty())
                return false;
          
            char check;
          
            switch (x) {
                
            case ')':
                
                check = stack.pop();
                
                if (check == '{' || check == '[')
                    return false;
                
                break;
 
            case '}':
                
                check = stack.pop();
                
                if (check == '(' || check == '[')
                    return false;
                
                break;
 
            case ']':
                
                check = stack.pop();
                
                if (check == '(' || check == '{')
                    return false;
                
                break;
            }
        }
 
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String expr = s.next();

        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}