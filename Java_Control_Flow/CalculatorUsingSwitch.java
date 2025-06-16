import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first, second;
        String op;

        System.out.print("Enter first number : ");
        first = sc.nextDouble();
        System.out.print("Enter second number : ");
        second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /) : ");
        op = sc.next();

        for (int i = 1; i < 2; i++) {
            switch (op) {
                case "+":
                    System.out.println("Result : " + (first + second));
                    break;
                case "-":
                    System.out.println("Result : " + (first - second));
                    break;
                case "*":
                    System.out.println("Result : " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result : " + (first / second));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
        }
    }
}
