import java.util.Scanner;

class HotelBookings {
	String guestName;
	String roomType;
	int nights;
	
	//Default Constructor
	HotelBookings() {
		this.guestName = "Guest";
		this.roomType = "Normal";
		this.nights = 1;
	}
	
	//Parameterized Constructor
	HotelBookings(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//Copy Constructor
	HotelBookings(HotelBookings hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
	
	//Method to display details of hotel
	void display() {
		System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Number of Nights : " + nights);
	}
}

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String guestName, roomType;
		int nights;
		
		System.out.println("Enter the guest name : ");
		guestName = sc.nextLine();
		System.out.println("Enter the room type : ");
		roomType = sc.nextLine();
		System.out.println("Enter the number of nights : ");
		nights = sc.nextInt();
		
		//Create the objects for class hotel booking
		HotelBookings booking1 = new HotelBookings(guestName, roomType, nights);
        HotelBookings booking2 = new HotelBookings(booking1);
        HotelBookings defaultBooking = new HotelBookings();
        
        System.out.println("\n---- Original Booking ----");
        booking1.display();

        System.out.println("\n---- Copied Booking ----");
        booking2.display();
        
        System.out.println("\n---- Default Booking ----");
        defaultBooking.display();
	}

}
