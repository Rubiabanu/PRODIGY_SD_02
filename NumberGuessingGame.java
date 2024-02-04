import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                guessed = true;
                System.out.printf("Congratulations! You guessed the number in %d attempts.%n", attempts);
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
    }
}