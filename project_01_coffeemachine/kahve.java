package project_01_coffeemachine;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class kahve {
    public static void main(String[] args) {
        kahve obj = new kahve();
        obj.showMenu();
    }
    Scanner scan = new Scanner(System.in);
    String option;
    void showMenu(){
        System.out.println("Welcome to 15 Grams Coffee House ");
        System.out.println("Please enter number coffee that you want to drink ");
        System.out.println("\n");
        System.out.println("1. Turkish Coffee");
        System.out.println("2. Filter Coffee");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");
        do {
            System.out.println("*************************************************************************************");
            System.out.println("Enter an option");
            System.out.println("*************************************************************************************");
            option = scan.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("\n");
            switch (option){
                case "TURKISH COFFEE":
                    System.out.println(option + " Preparing...");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "FILTER COFFEE":
                    System.out.println(option + " Preparing...");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "ESPRESSO":
                    System.out.println(option + " Preparing...");
                    System.out.println("***************************************************************");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "EXIT":
                    System.out.println(option + " Making...");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    break;
                default:
                    System.out.println("Invalid option!!  Please try again");
                    break;
            }
        }while (!option.equalsIgnoreCase("exit") && !option.equalsIgnoreCase("TURKISH COFFEE")
                && !option.equalsIgnoreCase("FILTER COFFEE") && !option.equalsIgnoreCase("ESPRESSO"));
        System.out.println(" Thanks for visiting 15 Grams Coffee House ");
    }
    void secenekler(){
        do {
            System.out.println("Would you like to add milk? (Please answer with Yes or No):");
            String strSugar = scan.next();
            if (strSugar.equalsIgnoreCase("yes")){
                System.out.println("Milk is adding...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            }else if (strSugar.equalsIgnoreCase("no")){
                System.out.println("No milk!!!");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            }else {
                System.out.println("Please enter a valid option.");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }
        }while (true);
        String bosKod1 = scan.nextLine();
        do {
            System.out.println("Would you like sugar ? (Please answer with Yes or No) :");
            String strSut = scan.next();
            String bosKod = scan.nextLine();
            if (strSut.equalsIgnoreCase("yes")) {
                try {
                    System.out.println("How many sugar would you like to add?" + "\nPlease choose from 1 to 5 ");
                    int kacSeker = scan.nextInt();
                    System.out.println(kacSeker + " Sugar is adding");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    break;
                }  catch(InputMismatchException e){
                    System.out.println("Please enter from 1 to 5!"
                            + "\n Please try again...:)");
                }
            } else if (strSut.equalsIgnoreCase("no")) {
                System.out.println("No sugar!!!");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else {
                System.out.println("Please enter a valid option.");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }
        }while (true);
        String bosKod = scan.nextLine();
        do {
            System.out.println("Which size would you like to have your coffee? (Large - Medium - Small ---- Please write you answer.) : ");
            String strBoyut = scan.nextLine().toUpperCase();
            if (strBoyut.equalsIgnoreCase("Large")){
                System.out.println(strBoyut + " " + option + " ready. Enjoy your coffee ...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            }else if (strBoyut.equalsIgnoreCase("small")) {
                System.out.println(strBoyut + " " + option + " ready. Enjoy your coffee...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else if (strBoyut.equalsIgnoreCase("Medium")) {
                System.out.println(strBoyut + " " + option + " ready. Enjoy your coffee...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else {
                System.out.println("Please enter a valid option.");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }
        }while (true);
    }
}