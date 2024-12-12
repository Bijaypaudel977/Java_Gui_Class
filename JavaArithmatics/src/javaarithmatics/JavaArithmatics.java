/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaarithmatics;
import java.util.Scanner;

/**
 *
 * @author bijay
 */
public class JavaArithmatics {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
  
        //Inputes 
        System.out.println("Enter First Number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter Second Number:");
        double num2 = scanner.nextDouble();
        
        // Operations 
        double sum = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double devide = num1 / num2;
        
        
        //Result Display
        System.out.println("\nResults:");
        System.out.println("\nAddition:"+sum);
        System.out.println("\nSubtracrtion:"+subtract);
        System.out.println("\nMultiplication:"+multiply);
        System.out.println("\nDevision:"+devide);

    }
    
}
