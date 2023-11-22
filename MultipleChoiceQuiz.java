import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Multiple-Choice Quiz:");
        System.out.println("1. What is the capital of France?");
        System.out.println("   a) London");
        System.out.println("   b) Paris");
        System.out.println("   c) Berlin");

        System.out.print("Your answer (a, b, or c): ");
        String answer1 = scanner.nextLine().trim().toLowerCase();

        if (answer1.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Paris.");
        }

        System.out.println("\n2. What is the largest planet in our solar system?");
        System.out.println("   a) Earth");
        System.out.println("   b) Jupiter");
        System.out.println("   c) Mars");

        System.out.print("Your answer (a, b, or c): ");
        String answer2 = scanner.nextLine().trim().toLowerCase();

        if (answer2.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Jupiter.");
        }

        System.out.println("\nYour score: " + score + " out of 2");

        scanner.close();
    }
}
