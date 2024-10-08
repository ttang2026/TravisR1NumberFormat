/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1numberformatp4;
import java.util.Random; //importing Random class

/**
 *
 * @author travi
 */
public class TravisR1NumberFormatP4 {

    public static void main(String[] args) {
        
        // Define the range
        long min = 100_000_000L; // minimum value
        long max = 999_000_000_000_000_000L; // maximum value
        
        // Creating a Random instance
        Random random = new Random();
        
        // Generating a random number within the range
        long randomNumber = min + (long) (random.nextDouble() * (max - min));
        
        // Formatting the random number as a string to avoid scientific notation
        String formatNumber = String.format("%,d", randomNumber);
        
        // Outputting the random number
        System.out.println("Random number: " + formatNumber);
    }
    
}

