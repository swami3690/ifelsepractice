import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
       int A;
       int B;
       int C;
       int D;
       int E;

        System.out.println("Enter first number");

        A = scan.nextInt();

        System.out.println("Enter Second number");

        B = scan.nextInt();

        System.out.println("Enter Third number");

        C = scan.nextInt();

        System.out.println("Enter Forth number");

        D = scan.nextInt();

        System.out.println("Enter fifth  number");

        E = scan.nextInt();

        int avg = (A + B + C + D + E) / 5;

        System.out.println("average number is :" + avg);








    }








}
