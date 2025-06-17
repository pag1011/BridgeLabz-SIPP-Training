import java.util.Scanner;

public class FrequencyOfDigits {
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

        int[] freq = new int[10]; 

        for (int digit : digits) {
            freq[digit]++;
        }

        System.out.println("Digit Frequencies : ");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " : " + freq[i] + " time(s)");
            }
        }
    }
}
