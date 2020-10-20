import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		double []grades=new double[3];
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=inp.nextLine();
		
		System.out.println("Enter the grades :");
		for(int i=0; i<grades.length;i++) {
			grades[i]=inp.nextDouble();
		}
		System.out.println("Enter the total number of students :");
		int numberOfStudents=inp.nextInt();
		
		StudentClass testimony=new StudentClass();
		StudentClass testimony1=new StudentClass(grades,name, numberOfStudents);
		testimony1.setName(name);
		testimony1.setGrades(grades);
		System.out.println(testimony1.printStudentDetails());
	}

}
