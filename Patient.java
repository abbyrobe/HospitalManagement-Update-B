package HospitalManagement_Update;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String medicalCondition;

    // Constructor - Must match the order of arguments when called in Main
    public Patient(String name, int age, String gender, String address, String phoneNumber, String medicalCondition) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCondition = medicalCondition;
    }

    // --- Getters ---
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getMedicalCondition() { return medicalCondition; }

    // --- Methods ---
    public void displayDetails() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Medical Condition: " + medicalCondition);
    }

    public void viewRecords() {
        System.out.println("\nMedical records for " + name + ":");
        System.out.println("Condition: " + medicalCondition);
    }
}