import java.util.Scanner;

public class converte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers, miles;
        int choice;

        System.out.println("=== Unit Converter ===");
        System.out.println("1. Convert Kilometers to Miles");
        System.out.println("2. Convert Miles to Kilometers");
        System.out.print("Choose an option (1 or 2): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                kilometers = input.nextDouble();
                miles = kilometers * 0.621371;
                System.out.println(kilometers + " km = " + miles + " miles");
                break;

            case 2:
                System.out.print("Enter distance in miles: ");
                miles = input.nextDouble();
                kilometers = miles / 0.621371;
                System.out.println(miles + " miles = " + kilometers + " km");
                break;

            default:
                System.out.println("Invalid option. Please run the program again.");
        }

        input.close();
    }
}
