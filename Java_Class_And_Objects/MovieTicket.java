
import java.util.Scanner;
class MovieTickets {
    String movieName;
    int seatNumber;
    double price;
    
    //Constructor
    MovieTickets(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    
    //Method to display the details 
    void display() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price : Rs." + price);
        System.out.println("Ticket Booked Successfully!");
    }
}

public class MovieTicket {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
    	String movieName;
        int seatNumber;
        double price;
        
        //Take input user
        System.out.println("Enter the movie name : ");
        movieName = sc.nextLine();
        System.out.println("Enter the seat number : ");
        seatNumber = sc.nextInt();
        System.out.println("Enter the price of the ticket : ");
        price = sc.nextDouble();
        
        //Create ticket object for movie
        MovieTickets ticket = new MovieTickets(movieName, seatNumber, price);
       
        //Display the details
        ticket.display();
    }
}
