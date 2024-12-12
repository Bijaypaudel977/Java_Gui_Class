/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averageage;
import java.util.Scanner;

/**
 *
 * @author bijay
 */
public class AverageAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Input the number of people
        System.out.print("Enter the number of people: ");
        int count = scanner.nextInt();

        // Validate input
        if (count <= 0) {
            System.out.println("The number of people must be greater than 0.");
            return;
        }

        // Input ages of all people
        double totalAge = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            double age = scanner.nextDouble();
            totalAge += age;
        }

        // Calculate the average age
        double averageAge = totalAge / count;

        // Display the result
        System.out.println("\nAverage Age: " + averageAge);
        
    }
    
}
