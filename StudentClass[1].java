
public class StudentClass {
	private String name;
	private double[] grades ;
	private static int totalnumberOfStudents;
	
	public StudentClass() {
		
	}
	

	public StudentClass(double[] grades, String name,int totalnumberOfStudents) {
		this.name=name;
		this.grades=grades;
		this.totalnumberOfStudents=totalnumberOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	 public double getAverage( double []grades ) {
		
		 double average=0;
		 double sum=0;
		 for(int i=0; i<grades.length;i++) {
			 sum+=grades[i];
		 }
		 average=(sum)/grades.length;
		 return average;
	 }
	public static int getTotalnumberOfStudents() {
		return totalnumberOfStudents;
	}
	
	public String printStudentDetails() {
		double average=getAverage(grades);
		return "the name of the student is :"+name+" ,the average of the grade is : "+average+"  and the total number of students in the class is: "+totalnumberOfStudents;
	}
	
}
