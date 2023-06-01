import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Hello there! What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println(name + ", I'm thinking of a number between 1 and 100.\n" + "Try to guess my number.");
        System.out.print("Your guess? ");
        int count = 0;

        while (true) {
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next(); // progressing past the invalid input
                System.out.println("That's not an integer, try again");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }
            count++;
            if (guess > number) {
                System.out.println("Your guess is too high, try again.");
                System.out.print("Your guess? ");
            } else if (guess < number) {
                System.out.println("Your guess is too low, try again.");
                System.out.print("Your guess? ");
            } else {
                System.out.println("Well done, " + name + "! You guessed my number in " + count + " tries!");
                break;
            }
        }
    }
}

