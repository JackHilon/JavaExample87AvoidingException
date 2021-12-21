
package javaexample87avoidingexception;

import java.util.Arrays;


public class ArrayHelper {
    
    public static void Sort(char[] array, int startIndex, int endIndex) {
        
        Arrays.sort(array, startIndex, endIndex);
    }
    
    public static void PrintArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();
    }
}
