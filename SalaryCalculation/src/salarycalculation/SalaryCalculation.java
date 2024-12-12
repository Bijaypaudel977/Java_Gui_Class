/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarycalculation;

import java.util.Scanner;

/**
 *
 * @author bijay
 */
public class SalaryCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Input basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate tax, allowance, and net salary
        double tax = 0.20 * basicSalary; // 20% tax
        double allowance = 0.40 * basicSalary; // 40% allowance
        double netSalary = basicSalary + allowance - tax;
        
        // Display results
        System.out.println("\nSalary Details:");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Tax (20%): " + tax);
        System.out.println("Allowance (40%): " + allowance);
        System.out.println("Net Salary: " + netSalary);
        
    }
    
}
