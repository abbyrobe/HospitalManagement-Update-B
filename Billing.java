package HospitalManagement_Update;
public class Billing {
    private Patient patient;
    private double amount;
    private String date;

    // Constructor
    public Billing(Patient patient, double amount, String date) {
        this.patient = patient;
        this.amount = amount;
        this.date = date;
    }

    // Method to display billing details
    public void displayDetails() {
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + date);
    }
}