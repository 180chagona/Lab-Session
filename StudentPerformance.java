
import java.util.Arrays;


public class StudentPerformance {
    private double[] grades;
    private String name;
    
    
    public void StudentPerfomance(double [] grades,String name){
       this.grades=grades;
       this.name=name;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getName(String name){
        
    return this.name;
    
    }
    
    
    public void setGrades(double [] grades){
    this.grades=grades;
    }
    
    public double[] getGrades(double[]grades){
        
        
        return this.grades;
    }
   
    public double getAverage(double []grades){
        double average;
        double sum=0;  
        for(int i=0;i<grades.length;i++){
           if(grades[i]<=50){
          grades[i]=0;
      }
        else if(grades[i]>=51 && grades[i]<=60){
                grades[i]=2;

        }
        else if(grades[i]>=61 && grades[i]<=70){
                grades[i]=3;

        }
        else if(grades[i]>=71 && grades[i]<=80){
                grades[i]=4;

        }
       
        else if ( grades[i]>=81 && grades[i] <=100 ) {
             grades[i]=5;

        }
               sum+=grades[i];

        }
        
        
        average=(sum)/(grades.length);
    return average;
    }
  public String printStudentDetails(){
      double average=getAverage(grades);
  return " the name of a student is "+this.name+" the simplified grades are : "+Arrays.toString(this.grades)+" the average is "+average;
  }
}