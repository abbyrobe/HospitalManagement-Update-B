package HospitalManagement_Update;
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    // Constructor
    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    // Method to display appointment details
    public void displayDetails() {
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Doctor Name: " + doctor.getName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}