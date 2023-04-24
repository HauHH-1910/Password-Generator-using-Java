
import java.util.Scanner;
import java.util.Random;

public class Random_Generator_Password {

    static Scanner scanner = new Scanner(System.in);

    static String op1 = "no";
    static String op2 = "no";
    static String op3 = "no";
    static String op4 = "no";

    private static void Symbols() {
        System.out.println("_____________________________________________________________________");
        System.out.println("Do you want to include symbols:");
        System.out.println("Sample about symbols: (e.g: @#!)");
        System.out.println("Yes or No");
        System.out.print("Enter your choice: ");

        op1 = scanner.nextLine();

        if (!(op1.equals("yes") || op1.equals("no") || op1.equals("Yes") || op1.equals("No"))) {
            System.out.println("Invalid input, try again: ");
            op1 = scanner.nextLine();
        } else {
            if (op1.equals("Yes") || op1.equals("yes")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will input symbols in random password");
            } else if (op1.equals("No") || op1.equals("no")) {
                System.out.println("_____________________________________________________________________");
                System.out.println("\n");
                System.out.println("Ok, I will  not input symbols in random password");
            }
        }
    }

    private static void Numbers() {
        System.out.println("_____________________________________________________________________");
        System.out.println("Do you want to include numbers: ");
        System.out.println("Sample about numbers: (e.g: 1234)");
        System.out.println("Yes or No");
        System.out.print("Enter your choice: ");

        op2 = scanner.nextLine();

        if (!(op2.equals("yes") || op2.equals("no") || op2.equals("Yes") || op2.equals("No"))) {
            System.out.println("Invalid input, try again: ");
            op2 = scanner.nextLine();
        } else {
            if (op2.equals("Yes") || op2.equals("yes")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will input symbols in random password");
            } else if (op2.equals("No") || op2.equals("no")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will  not input symbols in random password");
            }
        }
    }

    private static void Lowercase_char() {
        System.out.println("_____________________________________________________________________");
        System.out.println("Do you want to include lowercase characters: ");
        System.out.println("Sample about lowercase characters:");
        System.out.println("Yes or No");
        System.out.print("Enter your choice: ");

        op3 = scanner.nextLine();

        if (!(op3.equals("yes") || op3.equals("no") || op3.equals("Yes") || op3.equals("No"))) {
            System.out.println("Invalid input, try again: ");
            op3 = scanner.nextLine();
        } else {
            if (op3.equals("Yes") || op3.equals("yes")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will input symbols in random password");
            } else if (op3.equals("No") || op3.equals("no")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will  not input symbols in random password");
            }
        }
    }

    private static void Uppercase_char() {
        System.out.println("_____________________________________________________________________");
        System.out.println("Do you want to include uppercase characters: ");
        System.out.println("Sample about uppercase characters: (e.g: ABCD)");
        System.out.println("Yes or No");
        System.out.print("Enter your choice: ");

        op4 = scanner.nextLine();

        if (!(op4.equals("yes") || op4.equals("no") || op4.equals("Yes") || op4.equals("No"))) {
            System.out.println("Invalid input, try again: ");
            op4 = scanner.nextLine();
        } else {
            if (op4.equals("Yes") || op4.equals("yes")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will input symbols in random password");
            } else if (op4.equals("No") || op4.equals("no")) {
                System.out.println("_____________________________________________________________________");
                System.out.print("\n");
                System.out.println("Ok, I will  not input symbols in random password");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 1;
        System.out.println("_____________________________________________________________________");
        System.out.print("\n");

        System.out.print("Enter the length of the password [1, 16]: ");

        int length = scanner.nextInt();

        System.out.print("\n");
        System.out.println("_____________________________________________________________________");

        if (length <= 1 || length >= 16) {
            System.out.println("Try input again: ");
            length = scanner.nextInt();
        }

        System.out.println("_____________________________________________________________________");
        System.out.print("\n");

        System.out.println("Choose options in your password: ");

        switch (choice) {
            case 1: {
                Symbols();
            }
            case 2: {
                Numbers();
            }
            case 3: {
                Lowercase_char();
            }
            case 4: {
                Uppercase_char();
                break;
            }
        }
        String symbols = " ";
        String numbers = " ";
        String lowercaseChars = " ";
        String uppercaseChars = " ";

        if (op1.equals("yes")) {
            symbols = "!@#$%^&*()_+-=[]{}|;:',.<>/?";
        }
        if (op2.equals("yes")) {
            numbers = "0123456789";
        }
        if (op3.equals("yes")) {
            lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        }
        if (op4.equals("yes")) {
            uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }

        String passwordCharacters = symbols + numbers + lowercaseChars + uppercaseChars;

        Random random = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(passwordCharacters.length());
            password.append(passwordCharacters.charAt(index));
        }
        System.out.println("_____________________________________________________________________");
        System.out.print("\n");

        System.out.println("Randomly generated password: " + password.toString());

        System.out.print("\n");
        System.out.println("_____________________________________________________________________");

    }
}
