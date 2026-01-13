import java.util.Scanner;
public class StudentGradesIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents;
        
        System.out.print("Enter the number of students : ");
        numStudents = scanner.nextInt();
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " : ");
            int physicsMarks;
            do {
                System.out.print("  Physics : ");
                physicsMarks = scanner.nextInt();
                if (physicsMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (physicsMarks < 0);
            marks[i][0] = physicsMarks;
            
            int chemistryMarks;
            do {
                System.out.print("  Chemistry : ");
                chemistryMarks = scanner.nextInt();
                if (chemistryMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (chemistryMarks < 0);
            marks[i][1] = chemistryMarks;
            
            int mathMarks;
            do {
                System.out.print("  Maths : ");
                mathMarks = scanner.nextInt();
                if (mathMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (mathMarks < 0);
            marks[i][2] = mathMarks;
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) totalMarks / 300 * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        System.out.println("\nStudent Results");
        System.out.printf("%-10s %-8s %-8s %-8s %-12s %-6s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %-2d %-8d %-8d %-8d %-11.2f%% %-6c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}