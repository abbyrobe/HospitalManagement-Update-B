package HospitalManagement_Update;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter patient name: ");
            String name = input.nextLine();

            System.out.print("Enter patient age: ");
            if (!input.hasNextInt()) {
                throw new Exception("Age must be a number.");
            }
            int age = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            // This requires the Patient class defined above
            Patient patient = new Patient(name, age, "N/A", "N/A", "N/A", "N/A");

            System.out.println("\n--- Patient Details Recorded ---");
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Note: 'finally' block with input.close() is no longer needed 
        // if using the try-with-resources syntax above.
    }
}