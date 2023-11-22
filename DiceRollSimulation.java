import java.util.Random;

public class DiceRollSimulation {
    public static void main(String[] args) {
        // Create a Random object to simulate the dice rolls
        Random random = new Random();

        // Simulate rolling two six-sided dice
        int die1 = random.nextInt(6) + 1; // Random number between 1 and 6
        int die2 = random.nextInt(6) + 1; // Random number between 1 and 6

        // Display the result of the dice rolls
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);

        int total = die1 + die2;
        System.out.println("Total: " + total);
    }
}
