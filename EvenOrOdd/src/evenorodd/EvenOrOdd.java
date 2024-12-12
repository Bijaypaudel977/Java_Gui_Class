/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenorodd;
import 
java.util.Scanner;
/**
 *
 * @author bijay
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
