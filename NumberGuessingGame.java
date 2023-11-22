import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int userGuess;
        int numberOfAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfAttempts + " attempts.");
            }
        } while (userGuess != targetNumber);

        scanner.close();
    }
}
