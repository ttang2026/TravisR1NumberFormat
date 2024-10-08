/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1numberformat;
import java.util.Scanner; //importing Scanner class
import java.text.DecimalFormat; //importing DecimalFormat class
/**
 *
 * @author travi
 */
public class TravisR1NumberFormat {

    public static void main(String[] args) {
        
        // Setting up scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // Setting up DecimalFormat for the percentages of boys and girls
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        // The prompt for the total number of students
        System.out.println("Enter the total number of students at a school: ");
        int totalStudents = scan.nextInt();
        
        // The prompt for the number of girls
        System.out.println("Enter the number of girls at the school: ");
        int numberOfGirls = scan.nextInt();
        
        // The calculation for the number of boys
        int numberOfBoys = totalStudents - numberOfGirls;
        
        // Calculate the percentages
        double percentOfGirls = ((double) numberOfGirls / totalStudents) * 100;
        double percentOfBoys = ((double) numberOfBoys / totalStudents) * 100;
        
        //Output the results
        System.out.println("The percentage of girls is: " + fmt.format(percentOfGirls) + "%");
        System.out.println("The percentage of boys is: " + fmt.format(percentOfBoys) + "%");
    }
}



