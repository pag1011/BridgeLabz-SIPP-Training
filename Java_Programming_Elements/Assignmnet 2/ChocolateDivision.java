import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates : ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children : ");
        int numberOfChildren = sc.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates is " + remainingChocolates);
    }
}
