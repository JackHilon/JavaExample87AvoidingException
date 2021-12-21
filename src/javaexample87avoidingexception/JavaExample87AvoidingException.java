
package javaexample87avoidingexception;

import java.util.Scanner;



public class JavaExample87AvoidingException {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char[] myVector = new char[5];
        
        System.out.println("Feed a vector with "+myVector.length+" integers (write a string)....");
        
        FeedHelper.Feed(myVector);
        
        System.out.print("Your vector is: ");
        ArrayHelper.PrintArray(myVector);
        
        // enetring two indexes
        
        System.out.println("Enter two indexes...");
        
        int ind1, ind2;
        
        while(true)
        {
            // Remark! Program will crash in NumberformatException situation
            
            ind1=IntegerInputHelper.GetInteger(in);
            ind2=IntegerInputHelper.GetInteger(in);
            
            if(ind1 < 0 || ind2 > myVector.length || ind1 > ind2)
                System.out.println("Error indexes!!!!");
            
            else // all indexes are right
                break;
        }
        
        // sort array
        
        System.out.println("Your vector is sorted....");
        
        ArrayHelper.Sort(myVector, ind1, ind2);
        
        System.out.print("Your sorted vector is: ");
        ArrayHelper.PrintArray(myVector);
        
        
    }
    
}
