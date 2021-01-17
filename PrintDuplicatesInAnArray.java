
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInAnArray {
   
    public static void main(String[] args) {
        
        int arr[] = {1, 9, 4, 7, 8, 4, 7, 9, 3, 8}; // This is the array
        
        Set<Integer> uniqueNumber = new HashSet<>();
        boolean isDuplicateExist = false; //Sets boolean to false
        
        for (int i = 0; i < arr.length; i++) { //Check each element in the array
            if (uniqueNumber.contains(arr[i])) // Checks whether the elemnt has a duplicate
            {
                isDuplicateExist = true; //If so then the boolean turns to true
                System.out.println("DuplicateElement" + arr[i]); //Prints out the duplicate element
            }
            else {
                uniqueNumber.add(arr[i]); // The unique number gets added onto the array
                 }
            
            if(!isDuplicateExist)
            {
                System.out.println(-1); //prints out -1
            }
        }
    }
    
}
    
    
  