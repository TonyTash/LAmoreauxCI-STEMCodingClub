import java.util.*;
import java.io.*;

// L'Amoreaux C.I. Programming Enrighment Group

// Last updated December 23rd 2017
// by Tony Tascioglu

// COMMENTED SPECIAL EDITION

class FirstReverse {
    public static String FirstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */

        /*
         * Create an initial string, and set the
         * value to the input parameter passed by
         * the function.
         */
        String initString = str;

        /*
         * Create an array of characters, which
         * will later be used for processing.
         * Do not pass an array length, so that
         * it can be defined from the string.
         */
        char[] initArray;

        /*
         * Convert the string passed in from the
         * parameters to the array of characters.
         * This way, processing can be done on
         * each character.
         */
        initArray = initString.toCharArray();

        /*
         * Calculate the length of the array of
         * characters. This determines the length
         * of the word or string passed, and will
         * be used to determine the iterations
         * of the for loop.
         */
        int length = initString.length();

        /*
         * Create an array for the reversed word
         * which will be filled in after the
         * reversal process
         */
        char[] finalArray = new char[length];

        /*
         * Create a for loop to run through
         * every character in the array, and
         * assign it to the inverse position
         * in the final array.
         */
        for (int i = 0; i < length; i++) {

            /*
             * Reverse the characters in the
             * array. This takes the 1st letter
             * from the array, and puts it in
             * the opposite position in the final.
             *
             * The first letter becomes last,
             * second becomes second last etc.
             *
             * To calculate the letter from the
             * end, we substract the position we
             * want (i) from the length of the
             * word.
             */
            finalArray[length-(i+1)] = initArray[i];

        }

        /*
         * Convert the array of characters
         * back into a string, to be returned
         * from the method.
         */

        String finalString = String.valueOf(finalArray);

        // Set the return string as the final string
        str = finalString;

        // return the variable
        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}








    
