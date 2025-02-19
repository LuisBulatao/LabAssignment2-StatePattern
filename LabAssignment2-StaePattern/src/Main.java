import Context.VendingMachine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine machine = new VendingMachine(2);

        while (true) {
            System.out.println("\n===== VENDING MACHINE =====");
            System.out.println("1. Select Item");
            System.out.println("2. Insert Coin");
            System.out.println("3. Dispense Item");
            System.out.println("4. Set Out of Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.println("You selected: " + itemName);
                    machine.selectItem();
                    break;

                case 2:
                    System.out.print("Enter coin amount: ");
                    int amount = scanner.nextInt();
                    machine.insertCoin(amount);
                    break;

                case 3:
                    machine.dispenseItem();
                    break;

                case 4:
                    machine.setOutOfOrder();
                    break;

                case 5:
                    System.out.println("Exiting vending machine. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
