import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for password criteria
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include digits? (yes/no): ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        // Generate the random password based on user criteria
        String password = generateRandomPassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecialChars);

        // Display the generated password
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generateRandomPassword(int length, boolean includeUppercase, boolean includeLowercase,
                                                  boolean includeDigits, boolean includeSpecialChars) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        // Build the character set based on user criteria
        StringBuilder charSet = new StringBuilder();
        if (includeUppercase) {
            charSet.append(uppercaseChars);
        }
        if (includeLowercase) {
            charSet.append(lowercaseChars);
        }
        if (includeDigits) {
            charSet.append(digitChars);
        }
        if (includeSpecialChars) {
            charSet.append(specialChars);
        }

        // Check if the character set is empty
        if (charSet.length() == 0) {
            System.out.println("Error: No character set selected. Password cannot be generated.");
            System.exit(1);
        }

        // Generate the random password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charSet.length());
            password.append(charSet.charAt(randomIndex));
        }

        return password.toString();
    }
}
