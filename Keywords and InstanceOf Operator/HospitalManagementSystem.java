import java.util.Scanner;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first patient
        System.out.print("Enter Patient ID : ");
        String id1 = sc.nextLine();
        System.out.print("Enter Patient Name : ");
        String name1 = sc.nextLine();
        System.out.print("Enter Age : ");
        int age1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Ailment : ");
        String ailment1 = sc.nextLine();

        Patient p1 = new Patient(id1, name1, age1, ailment1);

        // Input for second patient
        System.out.print("\nEnter another Patient ID : ");
        String id2 = sc.nextLine();
        System.out.print("Enter Patient Name : ");
        String name2 = sc.nextLine();
        System.out.print("Enter Age : ");
        int age2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Ailment : ");
        String ailment2 = sc.nextLine();

        Patient p2 = new Patient(id2, name2, age2, ailment2);

        // Display patient details using instanceof operator
        System.out.println("\n--- Patient Details ---");

        if (p1 instanceof Patient) {
            p1.displayPatientDetails();
        }

        System.out.println();

        if (p2 instanceof Patient) {
            p2.displayPatientDetails();
        }

        // Static method to show total patients
        System.out.println();
        Patient.getTotalPatients();
	}
}
