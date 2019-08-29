import java.util.Scanner;

public class Interchange {


    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);


        int A , B ;

        int  temp =0 ;


        System.out.println("Enter first number ");

        A = scanner.nextInt();

        System.out.println("Enter second number ");
        B = scanner.nextInt();

        temp = A ;


        A = B ;

        B = temp ;


        System.out.println("value of A  is: " + A );
        System.out.println();

        System.out.println("value of B is : " + B);

        System.out.println();




















    }






}
