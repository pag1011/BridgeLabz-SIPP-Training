import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day, month;
		
		System.out.print("Enter the day : ");
		day = sc.nextInt();
		System.out.print("Enter the month : ");
		month = sc.nextInt();
		
		boolean isSpring = false;
		
		if((month == 3 && day >= 20 && day <= 31) || 
			(month == 4 && day >= 1 && day <= 30) ||
			(month == 5 && day >= 1 && day <= 31) || 
			(month == 6 && day >= 1 && day <= 20)) {
			isSpring = true;
		}
		
		if(isSpring) {
			System.out.println("Its a Spring Season.");
		} else {
			System.out.println("Not a Spring Season.");
		}
	}

}
