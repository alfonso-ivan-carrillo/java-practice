import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//        int x = 2;
//        do{
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);

        int x = 100;
        do{
            System.out.println(x);
            x -= 5;
        } while (x >= -10);


        long y = 2;  // wasn't working with int, needed to be long
        do{
            System.out.println(y);
            y *= y;
        } while (y < 1000000);


        for(int d = 100; d > -10; d -= 5){
            System.out.println(d);
        }

        for(long z = 2; z < 1000000; z = z * z){
            System.out.println(z);
        }

        for(int p = 1; p <= 100; p++){
            if(p % 3 == 0 && p % 5 == 0){
                System.out.println("FizzBuzz");
            } else if ( p % 3 == 0){
                System.out.println("Fizz");
            } else if (p % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(p);
            }
        }


        System.out.println("Enter an integer");
        Scanner scn = new Scanner(System.in);
        int userInput = scn.nextInt();
        System.out.println("Here is your table! \n");
        System.out.println("number | squared | cubed \n ______|________|_______" );
        for(int b = 1; b <= userInput; b++){
            int s = b * b;
            int c = b * b * b;
            System.out.printf("%s      | %s     | %s \n", userInput, s, c);
        }


        boolean keepGoing = true;
        while ( keepGoing) {
            System.out.println("Enter your grade.");
            Scanner scnG = new Scanner(System.in);
            int grade = scnG.nextInt();
            if (grade >= 88 && grade <= 100) {
                System.out.println("You got an A.");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("You got a B.");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("You got a C.");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("You got a D.");
            } else if (grade >= 0 && grade <= 59) {
                System.out.println("You got an F.");
            } else {
                System.out.println("Number entered is out of range");
            }
            System.out.println("Would you like to continue? true/false");
            Scanner sc = new Scanner(System.in);
            keepGoing = sc.nextBoolean();
        }



    }
}
