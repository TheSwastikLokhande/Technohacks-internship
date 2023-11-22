import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View To-Do List");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the to-do list.");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty. No items to remove.");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }

                        System.out.print("Enter the number of the item to remove: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (indexToRemove >= 1 && indexToRemove <= toDoList.size()) {
                            String removedItem = toDoList.remove(indexToRemove - 1);
                            System.out.println("'" + removedItem + "' removed from the to-do list.");
                        } else {
                            System.out.println("Invalid index. Please enter a number between 1 and " + toDoList.size() + ".");
                        }
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("Current To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
