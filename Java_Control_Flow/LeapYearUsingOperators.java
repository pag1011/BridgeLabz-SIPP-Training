import java.util.Scanner;

public class LeapYearUsingOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year : ");
        year = sc.nextInt();

        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is Not a Leap Year.");
            }
        } else {
            System.out.println("The program only works for year >= 1582 (Gregorian calendar).");
        }
    }
}
