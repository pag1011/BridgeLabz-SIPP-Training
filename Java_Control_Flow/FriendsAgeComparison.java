import java.util.Scanner;
public class FriendsAgeComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ageAmar, ageAkbar, ageAnthony;
		float heightAmar, heightAkbar, heightAnthony;
		
		System.out.print("Enter the age of Amar : ");
		ageAmar = sc.nextInt();
		System.out.print("Enter the age of Akbar : ");
		ageAkbar = sc.nextInt();
		System.out.print("Enter the age of Anthony : ");
		ageAnthony = sc.nextInt();
		
		System.out.print("Enter the height of Amar : ");
		heightAmar = sc.nextInt();
		System.out.print("Enter the height of Akbar : ");
		heightAkbar = sc.nextInt();
		System.out.print("Enter the height of Anthony : ");
		heightAnthony = sc.nextInt();
		
		String youngest;
		if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
			youngest = "Amar";
		} else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
			youngest = "Akbar";
		} else {
			youngest = "Anthony";
		}
		
		String tallest;
		if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
			tallest = "Amar";
		} else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
			tallest = "Akbar";
		} else {
			tallest = "Anthony";
		}
		
		System.out.println("The youngest friend is : " + youngest);
		System.out.println("The tallest friend is : " + tallest);
	}

}
