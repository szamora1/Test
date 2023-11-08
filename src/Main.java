// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int itemCount = 0;
        double totalCost = 0;

        // Initialize variables to store the item details
        String[] items = null;
        double[] itemCosts = null;

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add item");
            System.out.println("2. Print receipt");
            System.out.println("3. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of items you want to add: ");
                    itemCount = scanner.nextInt();

                    items = new String[itemCount];
                    itemCosts = new double[itemCount];

                    for (int i = 0; i < itemCount; i++) {
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter the name of item " + (i + 1) + ": ");
                        items[i] = scanner.nextLine();
                        System.out.print("Enter the cost of " + items[i] + ": ");
                        itemCosts[i] = scanner.nextDouble();
                        totalCost += itemCosts[i];
                    }
                    break;

                case 2:
                    if (totalCost == 0) {
                        System.out.println("No items added yet. Please add items before printing the receipt.");
                    } else {
                        System.out.println("\nReceipt:");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println(items[i] + " - $" + itemCosts[i]);
                        }
                        System.out.println("Total Items: " + itemCount);
                        System.out.println("Total Cost: $" + totalCost);
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}