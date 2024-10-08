/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1numberformatp3;
import java.text.DecimalFormat; //importing the DecimalFormat class
import java.util.Scanner; //importing the Scanner class

/**
 *
 * @author travi
 */
public class TravisR1NumberFormatP3 {

    public static void main(String[] args) {
        
        // Setting up scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // Ask for an integer between 0 and 15
        System.out.println("Enter an integer from 0 to 15 for the number of decimal places: ");
        int decimalPlaces = scan.nextInt();
        
        // Validate the input
        if (decimalPlaces < 0 || decimalPlaces > 15) {
            System.out.println("Invalid input! Please enter an integer between 0 and 15");
            
        } else {
            
            // Create a DecimalFormat instance based on the specified number of decimal places
            StringBuilder pattern = new StringBuilder("#.");
            
            for (int i = 0; i < decimalPlaces; i++) {
                pattern.append("0");
            }
            
            DecimalFormat dmf = new DecimalFormat(pattern.toString());
            
            // Format Pi
            String formatPi = dmf.format(Math.PI);
            
            // Outputting the Result
            System.out.println("Pi formatted to " + decimalPlaces + " decimal places: " + formatPi);
        }
    }
}
