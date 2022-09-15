import java.util.*;
import java.io.*;

public class Summation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);

        int count = 0;

        //using for loop
        int sumFor = 0;
        for (int i = 0; i < list.size(); i++)
            sumFor += list.get(i);

        System.out.println("sum of for loop= " + sumFor);

        //using while loop
        int sumWhile = 0;
        while (list.size() > count) {
            sumWhile += list.get(count);
            count++;
        }
        System.out.println("\n");
        System.out.println("sum of while loop = " + sumWhile);

        //using recursion
        int sumRecursion = sumOfElements(list, list.size()-1);
        System.out.println("\n");
        System.out.println("sum of recursion= " + sumRecursion);
    }

    public static int sumOfElements(List<Integer> elements, int index) {
        if ( index <  0 ) return 0;
        if ( index >= elements.size()) return 0;

        return elements.get(index) + sumOfElements(elements, index - 1);
    }
}