
import java.util.HashSet;
import java.util.Set;

 class Hashset {

    public static void main(String[] args) {
       String str2 = "Shreevatsa";
       String str1 = "Shre";
       
       
       System.out.println(hasUniqueCharacters(str1));
       System.out.println(hasUniqueCharacters(str2));
    }
    
    public static boolean hasUniqueCharacters(String toTest)
    {
        Set<Character> set = new HashSet<Character>();
        
        for (char c : toTest.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            else {
                set.add(c);
            }
        }
        return true;
        
    }
    
}
