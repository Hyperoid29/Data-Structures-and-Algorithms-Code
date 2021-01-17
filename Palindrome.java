
public class Palindrome {
    
    public static boolean isPalindrome (String test) {
        int i = 0;
        int j = test.length() - 1;
        
        
        while (i < j) {
            if (test.charAt(i) != test.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true; 
    }
    
    
    public static void main(String [] args) {
        String palindrome = "hello";
        if (isPalindrome(palindrome)) {
            System.out.println("This is a palindrome: " + palindrome);
        }
        else {
            System.out.println("This is not a palindrome: " + palindrome);
        }
    }
}
