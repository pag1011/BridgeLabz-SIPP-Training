public class PostgraduateStudent extends Student {
	public String specialization;
	
	//Constructor
	public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
		super(rollNumber, name, CGPA);
		this.specialization = specialization;
	}
	
	public void displayPostgradInfo() {
		System.out.println("\n---- Postgraduate Student Details ----");
		System.out.println("Roll No. : " + rollNumber);
		System.out.println("Name (from protected) : " + name);
		System.out.println("The title is : " + specialization);
	}
}
	