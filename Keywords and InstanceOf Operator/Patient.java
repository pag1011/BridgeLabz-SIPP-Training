class Patient {
    // Static variable
    static String hospitalName = "CityCare Multispeciality Hospital";
    static int totalPatients = 0;

    // Final variable
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this'
    Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Total Admitted Patients : " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient ID : " + patientID);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Ailment : " + ailment);
    }
}