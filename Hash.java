
import java.util.HashSet;
import java.util.Set;


public class Hash {

     public static void main(String[] args) {
         
         String str = "helo";
         
         System.out.println(isUnique(str));
     }
     
     public static boolean isUnique(String str) {
         Set <Character> set = new HashSet<>();
         
         for(char c : str.toCharArray()) {
             if (set.contains(c)) {
                 return false;
             }
             
             set.add(c);
         }
         
         return true;
     }
}
