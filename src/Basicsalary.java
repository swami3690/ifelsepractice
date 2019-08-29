import java.util.Scanner;

public class Basicsalary {



    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

       int employeeid;

       String employeename;

       double basicsalary;

        System.out.println("Enter the  employee id ");

        employeeid = scanner.nextInt();

        System.out.println("Enter the  employee name");

        employeename = scanner.next();

        System.out.println("Enter the basic salary ");

        basicsalary = scanner.nextDouble();

double HRA = basicsalary*10/100;

double DA = basicsalary*8/100;
double  TA = basicsalary*9/100;
double PF = basicsalary *20/100;

double gross_salary = basicsalary + HRA +DA + TA  - PF ;

        System.out.println("employeeid is "+ employeeid);
        System.out.println("employee name  "+ employeename);

        System.out.println(" Basic salary is " + basicsalary);
        System.out.println("Gross salary  " + gross_salary);
















    }
}
