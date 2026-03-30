package HospitalManagement_Update;
public class Medicalrecords {
    private Patient patient;
    private String date;
    private String description;

    // Constructor
    public Medicalrecords(Patient patient, String date, String description) {
        this.patient = patient;
        this.date = date;
        this.description = description;
    }

    // Method to display medicalrecords details
    public void displayDetails() {
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }
}