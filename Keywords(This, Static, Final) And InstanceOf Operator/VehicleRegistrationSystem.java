import java.util.Scanner;

public class VehicleRegistrationSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first vehicle
        System.out.print("Enter Registration Number : ");
        String regNo1 = sc.nextLine();
        System.out.print("Enter Owner Name : ");
        String owner1 = sc.nextLine();
        System.out.print("Enter Vehicle Type : ");
        String type1 = sc.nextLine();

        Vehicle v1 = new Vehicle(regNo1, owner1, type1);

        // Input for second vehicle
        System.out.print("\nEnter another Registration Number : ");
        String regNo2 = sc.nextLine();
        System.out.print("Enter Owner Name : ");
        String owner2 = sc.nextLine();
        System.out.print("Enter Vehicle Type : ");
        String type2 = sc.nextLine();

        Vehicle v2 = new Vehicle(regNo2, owner2, type2);

        // Update registration fee
        System.out.print("\nEnter new registration fee : ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        // Display vehicle details using instanceof operator
        System.out.println("\n--- Vehicle Details ---");

        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        System.out.println();

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }
	}
}
