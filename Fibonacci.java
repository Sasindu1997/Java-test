import java.util.*;
import java.io.*;
 
public class MergeClass {
    public static void main(String[] args)
    {
      
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);
        
        List<String> list2 = new ArrayList<>();
        list2.add("w");
        list2.add("f");
        list2.add("r");
        list2.add("b");
        list2.add("q");
        
       
       System.out.println("merged = " + merge(list, list2));
    }
    
    public static ArrayList merge(List a, List b) {
        int count1 = 0, count2 = 0;
        ArrayList<Object> res = new ArrayList<Object>();
    
        while(count1 < a.size() || count2 < b.size()) {
            if(count1 < a.size())
                res.add( a.get(count1++));
            if(count2 < b.size())
                res.add( b.get(count2++));
        }
        return res;
    }
}