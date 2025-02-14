package Noodle_Shop_Project;

import java.util.Scanner;

public class noodleShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Yummy Noodle Shop");

            String greeting = "Please select a category to order by enter number (1 or 2)!";
            String categories = "1. Type of Noodles \n2. Type of Drinks";
            System.out.println(greeting + categories);

            int selectedCategory = scanner.nextInt();

            if (selectedCategory == 1) {
                System.out.println("There are four types of noodles:");
                System.out.println("Please select the noodle name you want to buy! (e.g. 1, 2, 3 or 4)");

                String[] noodleNames = {"Chinese Noodle", "Thai Noodle", "Vietnamese Noodle", "Japanese Noodle"};
                int[] noodlePrices = {30, 40, 50, 60};

                for (int i = 0; i < noodleNames.length; i++) {
                    System.out.println((i + 1) + ". " + noodleNames[i] + " - " + noodlePrices[i] + " $");
                }

                int selectedNoodle = scanner.nextInt();

                switch (selectedNoodle) {
                    case 1:
                        System.out.println("You've selected " + noodleNames[0] + "     price - " + noodlePrices[0]);
                        System.out.println("Please, Enter the number of noodles you want to order!");
                        int noodleBowNumber1 = scanner.nextInt();
                        int noodleTotalPrice1 = noodleBowNumber1 * noodlePrices[0];
                        System.out.println("Noodle's name: " + noodleNames[0] + "\nItem Number: " + noodleBowNumber1 + "\nTotal price: " + noodleTotalPrice1);
                        break;
                    case 2:
                        System.out.println("You've selected " + noodleNames[1] + "     price - " + noodlePrices[1]);
                        System.out.println("Please, Enter the number of noodles you want to order!");
                        int noodleBowNumber2 = scanner.nextInt();
                        int noodleTotalPrice2 = noodleBowNumber2 * noodlePrices[1];
                        System.out.println("Noodle's name: " + noodleNames[1] + "\nItem Number: " + noodleBowNumber2 + "\nTotal price: " + noodleTotalPrice2);
                        break;
                    case 3:
                        System.out.println("You've selected " + noodleNames[2] + "     price - " + noodlePrices[2]);
                        System.out.println("Please, Enter the number of noodles you want to order!");
                        int noodleBowNumber3 = scanner.nextInt();
                        int noodleTotalPrice3 = noodleBowNumber3 * noodlePrices[2];
                        System.out.println("Noodle's name: " + noodleNames[2] + "\nItem Number: " + noodleBowNumber3 + "\nTotal price: " + noodleTotalPrice3);
                        break;
                    case 4:
                        System.out.println("You've selected " + noodleNames[3] + "     price - " + noodlePrices[3]);
                        System.out.println("Please, Enter the number of noodles you want to order!");
                        int noodleBowNumber4 = scanner.nextInt();
                        int noodleTotalPrice4 = noodleBowNumber4 * noodlePrices[3];
                        System.out.println("Noodle's name: " + noodleNames[3] + "\nItem Number: " + noodleBowNumber4 + "\nTotal price: " + noodleTotalPrice4);
                        break;
                    default:
                        System.out.println("Invalid selection! Please select a number between 1 and 4.");
                        break;
                }

            } else if (selectedCategory == 2) {
                String[] drinkNames = {"Coffee", "Green Tea", "Orange Juice", "Papaya Juice"};
                int[] drinkPrices = {10, 15, 20, 25};

                for (int i = 0; i < drinkNames.length; i++) {
                    System.out.println((i + 1) + ". " + drinkNames[i] + " - " + drinkPrices[i] + " $");
                }
                System.out.println("Please select the drink you want to order by entering number 1, 2, 3, or 4!");
                int selectedDrink = scanner.nextInt();

                switch (selectedDrink) {

                    case 1:
                        System.out.println("You've selected " + drinkNames[0] + "     price - " + drinkPrices[0]);
                        System.out.println("Please, Enter the number of drinks you want to order!");
                        int drinkNumber1 = scanner.nextInt();
                        int drinkTotalPrice1 = drinkNumber1 * drinkPrices[0];
                        System.out.println("Drink's name: " + drinkNames[0] + "\nItem Number: " + drinkNumber1 + "\nTotal price: " + drinkTotalPrice1);
                        break;
                    case 2:
                        System.out.println("You've selected " + drinkNames[1] + "     price - " + drinkPrices[1]);
                        System.out.println("Please, Enter the number of drinks you want to order!");
                        int drinkNumber2 = scanner.nextInt();
                        int drinkTotalPrice2 = drinkNumber2 * drinkPrices[1];
                        System.out.println("Drink's name: " + drinkNames[1] + "\nItem Number: " + drinkNumber2 + "\nTotal price: " + drinkTotalPrice2);
                        break;
                    case 3:
                        System.out.println("You've selected " + drinkNames[2] + "     price - " + drinkPrices[2]);
                        System.out.println("Please, Enter the number of drinks you want to order!");
                        int drinkNumber3 = scanner.nextInt();
                        int drinkTotalPrice3 = drinkNumber3 * drinkPrices[2];
                        System.out.println("Drink's name: " + drinkNames[2] + "\nItem Number: " + drinkNumber3 + "\nTotal price: " + drinkTotalPrice3);
                        break;
                    case 4:
                        System.out.println("You've selected " + drinkNames[3] + "     price - " + drinkPrices[3]);
                        System.out.println("Please, Enter the number of drinks you want to order!");
                        int drinkNumber4 = scanner.nextInt();
                        int drinkTotalPrice4 = drinkNumber4 * drinkPrices[3];
                        System.out.println("Drink's name: " + drinkNames[3] + "\nItem Number: " + drinkNumber4 + "\nTotal price: " + drinkTotalPrice4);
                        break;
                    default:
                        System.out.println("Invalid selection! Please select a number between 1 and 4.");
                        break;
                }

            } else {
                System.out.println("Invalid selection! Please only enter the number 1 or 2.");
            }

            System.out.println("Do you want to go back to the main menu or exit? (1. Main Menu, 2. Exit)");
            int choice = scanner.nextInt();
            if (choice == 2) {
                System.out.println("Thank you for visiting Yummy Noodle Shop! Goodbye!");
                break;
            }
        }
    }
}

