import java.util.Scanner;

/**
 * NumberGuess is a simple number guessing game where the user selects a difficulty level
 * and attempts to guess a randomly generated number within a limited number of attempts.
 */
public class NumberGuess {
    /**
     * The main method starts the game by prompting the user to choose a difficulty level.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game! ");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.\n");

        System.out.println("Please select the difficulty level: ");
        System.out.println("1. Easy (10 chances) \n2. Medium (5 chances) \n3. Hard (3 chances) \n");

        System.out.print("Enter your choice: ");
        int choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                Easy();
                break;
            case 2:
                Medium();
                break;
            case 3:
                Hard();
                break;
            default:
                System.out.println("Invalid choice: Run code again");
        }
    }

    /**
     * Starts the game in Easy mode with 10 chances.
     */
    public static void Easy() {
        Scanner keyboard = new Scanner(System.in);
        int initialCount = 10;
        int chances = 10;
        System.out.println("Great! You have selected the Easy difficulty level.");
        System.out.println("Let's start the game!");

        method(keyboard, initialCount, chances);
    }

    /**
     * Starts the game in Medium mode with 5 chances.
     */
    public static void Medium() {
        Scanner keyboard = new Scanner(System.in);
        int initialCount = 10;
        int chances = 5;
        System.out.println("Great! You have selected the Medium difficulty level.");
        System.out.println("Let's start the game!");

        method(keyboard, initialCount, chances);
    }

    /**
     * Starts the game in Hard mode with 3 chances.
     */
    public static void Hard() {
        Scanner keyboard = new Scanner(System.in);
        int initialCount = 10;
        int chances = 3;
        System.out.println("Great! You have selected the Hard difficulty level.");
        System.out.println("Let's start the game!");

        method(keyboard, initialCount, chances);
    }

    /**
     * Handles the main guessing logic of the game. The user attempts to guess a randomly generated
     * number within the given number of chances.
     *
     * @param keyboard Scanner object for user input
     * @param initialCount The total number of chances initially allotted
     * @param chances The remaining number of chances
     */
    private static void method(Scanner keyboard, int initialCount, int chances) {
        int max = 100;
        int min = 1;
        int systemNumberGuessed = (int) (Math.random() * (max - min + min)) + min;

        while (chances > 0) {
            System.out.print("\nEnter your guess: ");
            int guess = keyboard.nextInt();
            chances--;

            if (guess > systemNumberGuessed) {
                System.out.println("Incorrect! The number is less than " + guess);
            } else if (guess < systemNumberGuessed) {
                System.out.println("Incorrect! The number is greater than " + guess);
            } else {
                int chancesUsed = initialCount - chances;
                System.out.println("Congratulations! You guessed the correct number in " + chancesUsed + " attempts");
                break;
            }

            if (chances == 0) {
                System.out.println("Sorry: The number was " + systemNumberGuessed);
            }
        }
    }
}
