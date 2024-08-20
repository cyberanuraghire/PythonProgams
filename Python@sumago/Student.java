import java.util.Scanner;

class Student  {
    int rollNo;
    String name;
    double percentage;
    //defalut constructor
    public Student() {
        this.rollNo=0;
        this.name= " ";
        this.percentage=0.0;

    }
    public Student(int rollNO, String name, double percentage){
        this.rollNo = rollNo;
        this.name=name;
        this.percentage=percentage;

    }
    public void displayDetails(){

        System.out.println("Roll no is "+this.rollNo);
        System.out.println("Name is :"+this.name);
        System.out.println("Percentage is "+this.percentage+"%");
        System.out.println();
    }
}
    public class Main {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        Student[] students= new Student[5];
        for (int i=0;i<5;i++){

            System.out.println("Enter details of the students"+(i+1)+":");
            System.out.println("RollNO of student:");
            int rollNo= scanner.nextInt();
            System.out.println("Enter the name: ");
            String name= scanner.next();
            System.out.println("percentage:");
            double percentage = scanner.nextDouble();
            students[i]= new Student(rollNo, name, percentage);
        }
        //displaying details of student 
        System.out.println("STUDENT DETAILS ARE!!!!!!");
        for( Student student : students){
            student.displayDetails();
        }

    }
}
