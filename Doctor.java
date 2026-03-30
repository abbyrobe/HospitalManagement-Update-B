package HospitalManagement_Update;
public class Doctor {
    private String name;
    private String specialization;
    private int experience;

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public int getExperience() { return experience; }

    public String toString() {
        return name + " | " + specialization + " | " + experience + " years";
    }
}
