package javaexample87avoidingexception;

import java.io.*; // IOException, InputStreamReader

public class FeedHelper {

    public static void Feed(char[] array) {
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            for (int i = 0; i < array.length; i++) {
                array[i] = (char) input.read();
            }
        } catch (IOException e) {
            // do nothing
        }
    }

}
