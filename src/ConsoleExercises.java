import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s. \n", pi);

        System.out.println("Please enter a number.");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(num);

        Scanner scn1 = new Scanner(System.in);
        String first = scn1.next();


        Scanner scn2 = new Scanner(System.in);
        String second = scn2.next();


        Scanner scn3 = new Scanner(System.in);
        String third = scn3.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("Please enter a sentence.");
        Scanner scnS = new Scanner(System.in);
        String sen = scnS.nextLine();
        System.out.println(sen);

        System.out.println("Please enter the length of your classroom.");
        Scanner scnL = new Scanner(System.in);
        double length = (scnL.nextDouble());

        System.out.println("Please enter the width of your classroom");
        Scanner scnW = new Scanner(System.in);
        double width = scnW.nextDouble();

        System.out.println("The area of your classrom is " + (width * length) + ".");
        System.out.println("The perimeter of your classroom is " + ((width * 2)+(length *2)) + ".");



    }
}
