Import java.util.HashMap;
Import java.util.Scanner;
Public class InventorySystem {
    Private HashMap<String, Integer> inventory;
 Public InventorySystem() {
        Inventory = new HashMap<>();
    }
 // Method to add an item
    Public void addItem(String itemName, int quantity) {
        Inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
        System.out.println(quantity + “ “ + itemName + “(s) added.”);
    }

    // Method to update an item
    Public void updateItem(String itemName, int quantity) {
        If (inventory.containsKey(itemName)) {
            Inventory.put(itemName, quantity);
            System.out.println(itemName + “ updated to “ + quantity + “.”);
        } else {
            System.out.println(itemName + “ does not exist in the inventory.”);
        }
    }

    // Method to remove an item
    Public void removeItem(String itemName) {
        If (inventory.remove(itemName) != null) {
            System.out.println(itemName + “ removed from inventory.”);
        } else {
            System.out.println(itemName + “ does not exist in the inventory.”);
        }
    }

    // Method to display the inventory
    Public void displayInventory() {
        System.out.println(“\nCurrent Inventory:”);
        If (inventory.isEmpty()) {
            System.out.println(“The inventory is empty.”);
        } else {
            For (String item : inventory.keySet()) {
                System.out.println(item + “: “ + inventory.get(item));
            }
        }
    }

    Public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println(“Simple Inventory System”);
        System.out.println(“Available commands: add, update, remove, display, exit”);

        While (true) {
            System.out.print(“\nEnter command: “);
            Command = scanner.nextLine().trim().toLowerCase();

            Switch (command) {
                Case “add”:
                    System.out.print(“Enter item name: “);
                    String addItemName = scanner.nextLine();
                    System.out.print(“Enter quantity: “);
                    Int addQuantity = Integer.parseInt(scanner.nextLine());
                    inventorySystem.addItem(addItemName, addQuantity);
                    break;

                case “update”:
                    System.out.print(“Enter item name: “);
                    String updateItemName = scanner.nextLine();
                    System.out.print(“Enter new quantity: “);
                    Int updateQuantity = Integer.parseInt(scanner.nextLine());
                    inventorySystem.updateItem(updateItemName, updateQuantity);
                    break;

                case “remove”:
                    System.out.print(“Enter item name: “);
                    String removeItemName = scanner.nextLine();
                    inventorySystem.removeItem(removeItemName);
                    break;

                case “display”:
                    inventorySystem.displayInventory();
                    break;

                case “exit”:
                    System.out.println(“Exiting the inventory system.”);
                    Scanner.close();
                    Return;

                Default:
                    System.out.println(“Invalid command. Please try again.”);
            }
        }
    }
}
