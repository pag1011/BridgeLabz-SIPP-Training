import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int years;
		double salary;
		
		System.out.print("Enter salary : ");
		salary = sc.nextDouble();
		System.out.print("Enter the years of service : ");
		years = sc.nextInt();
		
		if (years > 5) {
			double bonus = salary * 0.05;
			System.out.println("Bonus awarded : Rs. " + bonus);
		}
		else {
			System.out.println("No bonus awarded as the servive is 5 years or less.");
		}
	}

}
