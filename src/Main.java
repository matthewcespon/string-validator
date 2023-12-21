//  Import Scanner to receive input from keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        System.out.println("Enter a sentence to validate: ");
        userInput = keyboard.nextLine(); // Scanner method collects data from user

        //  While string is empty keep asking user
        while (userInput.equals("")){
            System.out.println("Enter valid sentence! or type 'quit' to exit program: ");
            userInput = keyboard.nextLine();
        }
        //  Allow user to exit program
        if (userInput.equals("quit")){
            System.out.println("Exiting program.....");
            System.exit(0);
        }
        boolean isValid = ValidateSentence.SentenceValidator(userInput);
        if (isValid){
            System.out.println("Valid sentence!");
        } else System.out.println("Invalid sentence!");
    }
}
