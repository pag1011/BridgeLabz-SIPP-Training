import java.util.Scanner;

class Persons {
	String name;
	int age;
	
	//Parameterized constructor
	Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Copy Constructor
	Persons(Persons p) {
		this.name = p.name;
		this.age = p.age;
	}
	
	//Method to display the details of person
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}

public class Person {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		//Taking input user
		System.out.println("Enter the name of a person : ");
		name = sc.nextLine();
		System.out.println("Enter the age of a person : ");
		age = sc.nextInt();
		
		//Create object using constructors
		Persons p1 = new Persons(name, age);
		Persons p2 = new Persons(p1);
		
		System.out.println("Original Person : ");
        p1.display();

        System.out.println("Copied Person : ");
        p2.display();
	}

}
