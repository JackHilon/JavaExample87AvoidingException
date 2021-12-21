
package javaexample87avoidingexception;

import java.util.Scanner;


public class IntegerInputHelper {
    
    
    
    public static int GetInteger(Scanner in)
    {
        return Integer.parseInt(in.nextLine());
        // exception is processed in main program
    }
}
