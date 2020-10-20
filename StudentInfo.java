import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[]args){
        
        
           
        Scanner input= new Scanner( System.in );
        System.out.println("Enter your name");
        String name=input.next();
        
        System.out.println( "Enter year of study :" );
        int yearOfStudy= input.nextInt();
        
       int courses=0;
        if ( yearOfStudy <3 ) {
            courses=3;
        }
        else if (yearOfStudy >=3 && yearOfStudy <=4){
            courses=2;
        }
         double[] grades = new double[courses];
        System.out.println( "Enter grades :" );
        for(int i =0; i<grades.length; i++){
         grades[i]=input.nextDouble();
        }
        
        
        //creating an object of a class StudentPerformance
        StudentPerformance student=new StudentPerformance();
        
        student.setName(name);
   
        student.setGrades(grades);
        
        //System.out.println("Your name is "+student.getName(name)+" Your Grades are "+Arrays.toString(student.getGrades(grades))+"  and the GPA is "+student.getAverage(grades));
      System.out.println(student.printStudentDetails());
    }
}
