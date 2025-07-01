import java.util.Scanner;

class Course {
	String courseName;
	int duration;
	double fee;
	
	//Class Variable
	static String instituteName;
	
	//Constructor
	Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
        this.fee = fee;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fee : Rs." + fee);
        System.out.println("Institute Name : " + instituteName);
	}
	
	//Method to update institute name
	static void updateInstituteName(String newInstituteName) {
		instituteName = newInstituteName;
		System.out.println("Institute name updated to : " + instituteName);
	}
}

public class OnlineCourseManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the institute name : ");
		String instName = sc.nextLine();
		Course.updateInstituteName(instName);
		
		System.out.println("How many courses do you want to enter ? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Course[] onlineCourses = new Course[n];
		
		for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + " : ");

            System.out.print("Course Name : ");
            String name = sc.nextLine();

            System.out.print("Duration (in months) : ");
            int dur = sc.nextInt();

            System.out.print("Fees : Rs.");
            double fees = sc.nextDouble();
            sc.nextLine(); 

            onlineCourses[i] = new Course(name, dur, fees);
        }

		System.out.print("Do you want to update the institute name again? (yes/no): ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("yes")) {
		    System.out.print("Enter new institute name: ");
		    String newInstName = sc.nextLine();
		    Course.updateInstituteName(newInstName);

		    System.out.println("\n--- Updated Course Details ---");
		    for (Course c : onlineCourses) {
		        c.displayCourseDetails();
		        System.out.println();
		    }
		}
	}

}
