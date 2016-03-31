package edu.tomer.ness;

import java.util.Scanner;

public class IO {
    static Scanner scan = new Scanner(System.in);
    /**
     *
     * @param output Enter a number:
     * @return an int from the scanner
     */
    static int getInt(String output){
        System.out.println(output);
        return scan.nextInt();
    }


    /**
     *
     * @param output Enter a number:
     * @return a String from the scanner
     */
    static String getString(String output){
        System.out.println(output);
        return scan.next();
    }


    /**
     *
     * @param output Enter a number:
     * @return a boolean from the scanner
     */
    static boolean getBoolean(String output){
        System.out.println(output);
        return scan.nextBoolean();
    }
}
