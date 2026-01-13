import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number : ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
    }
}
