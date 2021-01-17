
import java.util.Stack;


public class validParenthesis {

    public static boolean isParenthesis(String s) {
        Stack <Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    
    public static void message () {
        System.out.println("This is not a parenthesis");
    }
    
    public static void main (String [] args) {
        
        String paren = "[{]))";
        if (isParenthesis(paren)) {
            System.out.println("This is a parenthesis");
        }
        else {
           message();
        }
       
    }
    
}
