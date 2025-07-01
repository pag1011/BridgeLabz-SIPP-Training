public class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	//Constructor
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public double getCGPA() {
		return CGPA;
	}
	
	public void setCGPA(double CGPA) {
		this.CGPA = CGPA;
	}
	
	public void display() {
		System.out.println("\n---- Student Details ----");
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Name : " + name);
		System.out.println("CGPA : " + CGPA);
	}
}