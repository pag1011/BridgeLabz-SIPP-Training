import java.util.Scanner;
public class Handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of Students : ");
		int numberOfStudents = sc.nextInt();
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		System.out.println("Maximum numbers of handshakes : " + handshakes);
	}

}
