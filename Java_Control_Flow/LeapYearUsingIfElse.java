import java.util.Scanner;
public class LeapYearUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.print("Enter a year : ");
		year = sc.nextInt();
		
		if(year >= 1582) {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println(year + " is a Leap Year.");
					} else {
						System.out.println(year + " is NOT a Leap Year.");
					}
				} else {
					System.out.println(year + " is a Leap Year.");
				}
			} else {
				System.out.println(year + " is NOT a Leap Year.");
			}
		} else {
			System.out.println("Year must be >= 1582.");
		}
	}

}
