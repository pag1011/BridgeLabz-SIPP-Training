import java.util.*;

public class VehicleRegistration {
	String ownerName;
	String vehicleType;
	static double registrationFee;
	VehicleRegistration(String ownerName, String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	void displayDetails() {
		System.out.println("Owner Name : " + ownerName);
		System.out.println("Vehicle Type : " + vehicleType);
		System.out.println("Registration Fees : " + registrationFee);
	}
	static void updateRegistrationDetails(double newFee) {
		registrationFee = newFee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Registration Fee for all vehicles : Rs.");
		
		double fee = sc.nextDouble();
        updateRegistrationDetails(fee);
        // Take number of vehicles
        System.out.print("Enter number of vehicles : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        VehicleRegistration[] vehicles = new VehicleRegistration[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1) + " : ");

            System.out.print("Owner Name : ");
            String owner = sc.nextLine();

            System.out.print("Vehicle Type : ");
            String type = sc.nextLine();

            vehicles[i] = new VehicleRegistration(owner, type);
        }

        // Display vehicle details
        System.out.println("\n--- Vehicle Details ---");
        for (VehicleRegistration v : vehicles) {
            v.displayDetails();
        }

	}

}