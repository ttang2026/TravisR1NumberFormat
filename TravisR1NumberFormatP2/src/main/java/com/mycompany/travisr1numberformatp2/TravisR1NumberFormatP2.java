/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1numberformatp2;
import java.util.Scanner; //importing Scanner class
import java.text.NumberFormat; //importing NumberFormat class
import java.util.Locale; //importing Locale class
/**
 *
 * @author travi
 */
public class TravisR1NumberFormatP2 {

    public static void main(String[] args) {
        
        // Setting up scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // The Exchange Rate from American Dollars to British Pounds
        final double exchangeRate = 0.83;
        
        // Ask for total amount of money in dollars and cents
        System.out.println("Enter the total amount of money in dollars and cents (ex: 356.45): ");
        double amountInDollars = scan.nextDouble();
        
        // Convert to British pounds
        double amountInPounds = amountInDollars * exchangeRate;
        
        // Creating a NumberFormat instance for British Currency
        NumberFormat fmtNumber = NumberFormat.getCurrencyInstance(Locale.UK);
        
        //Format the amount in pounds
        String formatPounds = fmtNumber.format(amountInPounds);
        
        //Outputting the results
        System.out.println("The amount in British Pounds using an exchange rate of " + exchangeRate + " pence to the $ is " + formatPounds);
    }
}

