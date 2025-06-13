import java.util.Scanner;
public class DiscountedStudentFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the course fee : ");
		double fee = sc.nextDouble();
		
		System.out.print("Enter the discount offer : ");
		double discountOffer = sc.nextDouble();
		
		double discount = (fee * discountOffer) / 100;
		double finalFee = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + 
				" and the final discounted fee is INR " + finalFee);
	}

}
