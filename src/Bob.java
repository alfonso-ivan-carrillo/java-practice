import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String keepGoing = "yes";
        System.out.println("Start a conversation with Bob.");

        while ( keepGoing.equalsIgnoreCase("yes")){
            System.out.println("Say something to Bob.");
            Scanner scn = new Scanner(System.in);
            String userInput = scn.nextLine();
            if (userInput.endsWith("?")){
                System.out.println("Bob: Sure.");
            } else if ( userInput.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.equals(" ")){
                System.out.println("Bob: Fine be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
            System.out.println("Do you want to ask Bob another question? yes/no");
            Scanner sc = new Scanner(System.in);
            keepGoing = sc.nextLine();
        }






    }
}
