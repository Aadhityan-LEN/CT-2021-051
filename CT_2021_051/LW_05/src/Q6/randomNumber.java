package Q6;
import java.util.Scanner;
import java.util.Random;

public class randomNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;  // Initialize guess
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // While loop version
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try higher.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try lower.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
        scanner.close();
    }
}
