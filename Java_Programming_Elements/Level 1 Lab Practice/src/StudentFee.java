
public class StudentFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee = 125000;
		double discountOffer = 10;
		double discount = (fee * discountOffer) / 100;
		double discountFee = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + 
				" and final discounted fee is INR " + discountFee);
	}

}
