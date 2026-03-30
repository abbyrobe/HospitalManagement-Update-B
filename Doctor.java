package HospitalManagement_Update;
public class Doctor {
    private String name;
    private String specialization;
    private String phoneNumber;
    // Constructor
    public Doctor(String name, String specialization, String phoneNumber) {
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Methods to display doctor details 
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Phone Number: " + phoneNumber);
    }
    // Method to diagnose a patient
    public void diagnose(Patient patient) {
        System.out.println(name + " is diagnosing " + patient.getName());
        System.out.println("Diagnosis: " + patient.getMedicalCondition());
    }
    }