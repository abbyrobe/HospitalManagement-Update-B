package HospitalManagement_Update;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class HospitalSystem {

    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        loadPatientsFromFile(); // load saved data at start

        int choice;

        do {
            System.out.println("\n--- HOSPITAL MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Save Patients");
            System.out.println("4. Load Patients");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    savePatientsToFile();
                    break;
                case 4:
                    loadPatientsFromFile();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    // 🔹 Add Patient
    public static void addPatient() {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter disease: ");
        String disease = input.nextLine();

        patients.add(new Patient(name, age, disease));
        System.out.println("Patient added successfully!");
    }

    // 🔹 View Patients
    public static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    // 🔹 Save to File
    public static void savePatientsToFile() {
        try {
            FileWriter writer = new FileWriter("patients.txt");

            for (Patient p : patients) {
                writer.write(p.getName() + "," + p.getAge() + "," + p.getDisease() + "\n");
            }

            writer.close();
            System.out.println("Patients saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // 🔹 Load from File
    public static void loadPatientsFromFile() {
        try {
            File file = new File("patients.txt");
            Scanner reader = new Scanner(file);

            patients.clear(); // avoid duplicates

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",");

                patients.add(new Patient(
                        data[0],
                        Integer.parseInt(data[1]),
                        data[2]
                ));
            }

            reader.close();
            System.out.println("Patients loaded from file.");
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }
    }
}