import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {


   Scanner scanner = new Scanner(System.in);

   String name;


   int rollnumber ;

   double eng,maths, sience ;


        System.out.println("Enter The student name ");

        name = scanner.next();

        System.out.println("Enter the roll number");

        rollnumber = scanner.nextInt();

        System.out.println("Enter marks of Eng ");


        eng = scanner.nextDouble();

        System.out.println("Enter marks of maths");

        maths = scanner.nextDouble();

        System.out.println("Enter the marks of sience");


        sience = scanner.nextDouble();

        double Total = eng + maths +sience;

        double Percentage = Total/300*100;

        System.out.println("student name is:  " + name );
        System.out.println("student roll is " + rollnumber);
        System.out.println("Total marks of subjects: " + Total);

        System.out.println("Ttoal percentage of: " + name + " is " + Percentage + " %");

        if (Percentage >= 35 ){

            System.out.println( name + " is pass ");


        }
        else {

            System.out.println(name + " is fail");

        }

        if (Percentage >= 80 ){

            System.out.println(" grade A+");

        }

        else if ( Percentage < 80 && Percentage >= 60){

            System.out.println( "grade A");

        }

        else if ( Percentage < 60 && Percentage >= 50){

            System.out.println(" grade B");


        }
        else if (Percentage <50 && Percentage >= 35){

            System.out.println(" grade C");

        }
         else

        {
            System.out.println(" grade D");


        }





















    }












    }








