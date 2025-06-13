
public class PenDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPens = 14;
		int totalStudents = 3;
		
		int penPerStudents = totalPens / totalStudents;
		int remainingPens = totalPens % totalStudents;
		
		System.out.println("The Pen Per Students is " + penPerStudents + 
				" and the remaining pens not distributed is " + remainingPens);
	}

}
