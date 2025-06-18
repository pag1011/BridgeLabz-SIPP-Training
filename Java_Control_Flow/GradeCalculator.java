import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics, chemistry, maths;
        
        System.out.print("Enter marks in Physics : ");
        physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry : ");
        chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths : ");
        maths = sc.nextInt();
        
        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("\nResult ");
        System.out.printf("Average Marks : %.2f%%\n", average);
        System.out.println("Grade : " + grade);
        System.out.println("Remarks : " + remarks);
    }
}
