import java.util.*;
import java.io.*;
import java.util.Collections;
import java.util.stream.Collectors;
 
class FormLargerstNumber {
    public static void main(String[] args)
    {
      
        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
 
        String largestNo = largestNumberFunc(numbers);
        System.out.println("Largest = " + largestNo);
        
    }
    
    public static String largestNumberFunc(List<Integer> nums)
    {
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
    
    
 
}