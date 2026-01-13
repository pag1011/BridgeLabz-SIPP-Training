import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter the student age : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Voting Eligibility Results : ");
		for (int i = 0; i < arr.length; i++) {
			int age = arr[i];
			if(age < 0) {
				System.out.println("Student " + (i + 1) + " : Invalid age entered.");
			} else if (age >= 18) {
				System.out.println("Student " + (i + 1) + " : The student with the age " + age + " can vote.");
			} else {
				System.out.println("Student " + (i + 1) + " : The student with the age " + age + " can not vote.");
			}
		}
	}

}
