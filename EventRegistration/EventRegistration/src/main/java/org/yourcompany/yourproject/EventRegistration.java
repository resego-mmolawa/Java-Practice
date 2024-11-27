package org.yourcompany.yourproject;
import java.util.Scanner;

/**
 *
 * @author reseg
 */
public class EventRegistration {

    private String name;
    private String surname;
    private String code;
    private String password;
    Scanner input = new Scanner(System.in);

    // Validate booking code (must be 12 characters or less and contain an underscore)
    public boolean checkBookingCode(String code){
        return code.length() <= 12 && code.contains("_");
    }

    // Validate password complexity (8+ chars, one uppercase, one number, one special char)
    public boolean checkPasswordComplexity(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$";
        return password.length() >= 8 && password.matches(regex);
    }

    // Handle reservation logic with validation
    public String makeReservation(String name, String surname, String code, String password){
        if (!checkBookingCode(code)){
            return "Invalid booking code. Please enter a valid booking code";
        }
        
        if (!checkPasswordComplexity(password)){
            return "Password not correctly formatted. Your password should contain more than 8 characters, an uppercase letter, a number, and a special character.";
        }

        this.name = name;
        this.surname = surname;
        this.code = code;
        this.password = password;

        return "Reservation confirmed";
    }

    // Handle user input and validation for registration
    public void userRegistration(){
        System.out.print("Please enter your name: ");
        String name = input.nextLine();  // Use nextLine to handle full name if needed

        System.out.print("Please enter your surname: ");
        String surname = input.nextLine();  // Same for surname

        // Loop until valid booking code is provided
        String code;
        while (true) {
            System.out.print("Please enter booking code: ");
            code = input.nextLine();
            if (checkBookingCode(code)) {
                break;
            } else {
                System.out.println("Invalid booking code. The code should contain an underscore and be 12 characters or less.");
            }
        }

        // Loop until valid password is provided
        String password;
        while (true) {
            System.out.print("Please enter password: ");
            password = input.nextLine();
            if (checkPasswordComplexity(password)) {
                break;
            } else {
                System.out.println("Password not correctly formatted. It should contain at least 8 characters, an uppercase letter, a number, and a special character.");
            }
        }

        // Save registration data
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.password = password;

        System.out.println("Reservation successful. Welcome " + this.name + " " + this.surname);
    }

    // Main method for menu options and program execution
    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Make reservation");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();  // Handle new line after integer input

            switch (choice) {
                case 1:
                    registration.userRegistration();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    input.close();  // Close scanner before exiting
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
