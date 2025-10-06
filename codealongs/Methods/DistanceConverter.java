package codealongs.Methods;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        menu();
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();
        milesToKilometers(distance);
        kilometersToMiles(distance);
        scan.close();
    }

    static void milesToKilometers(double miles) {
        double kilometers = miles * 1.60934;
        System.out.println(kilometers);
    }

    static void kilometersToMiles(double kilometers) {
        double miles = kilometers / 1.60934;
        System.out.println(miles);
    }
    static void menu(){
        
        Scanner scan = new Scanner(System.in);
        int choice;

        do{
            System.out.println("|==Converter==|");
            System.out.println("===Main Menu===");
            System.out.println("1. Kilometers to Miles.");
            System.out.println("2. Miles to Kilometers.");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            choice = scan.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("Enter how many kilometers:");
                break;

            case 2: 
                System.out.println("Enter how many miles:");
                break;

            case 3: 
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("\nInvalid choice, please enter a number between 1 and 3 :).");

        }

            System.out.println(); //Prints a blank line
        } while (choice !=3);

        if (choice == 1);{
            kilometersToMiles(choice);
        }else

        }
        
        
        

    }

        

    
}

    

