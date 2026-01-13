import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + " : ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height (in cm) of " + names[i] + " : ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend : " + names[youngestIndex] + 
        		" (Age : " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend : " + names[tallestIndex] + 
        		" (Height : " + heights[tallestIndex] + " cm)");
    }
}
