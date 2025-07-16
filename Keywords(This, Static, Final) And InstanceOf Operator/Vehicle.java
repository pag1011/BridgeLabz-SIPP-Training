class Vehicle {
    // Static variable
    static double registrationFee = 5000.0; // Default fee for all vehicles

    // Final variable
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this'
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Registration Number : " + registrationNumber);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration Fee : Rs." + registrationFee);
    }
}