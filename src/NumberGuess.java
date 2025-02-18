import java.util.Scanner;

public class NumberGuess {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game! ");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.\n");

        System.out.println("Please select the difficulty level: ");
        System.out.println("1. Easy (10 chances) \n2. Medium (5 chances) \n3. Hard (3 chances) \n");

        System.out.print("Enter your choice: ");
        int choice = keyboard.nextInt();

        switch (choice){
            case 1: Easy();
                break;
            case 2: Medium();
                break;
            case 3: Hard();
                break;
            default: System.out.println(" Invalid choice: Run code again ");
        }


    }

    public static void Easy(){
        Scanner keyboard = new Scanner(System.in);
        int initalCount = 10;
        int chances = 10;
        System.out.println("Great! You have selected the Easy difficulty level.");
        System.out.println("Let's start the game!");

        int max = 100;
        method(keyboard,initalCount,chances);
    }

    public static void Medium(){
        Scanner keyboard = new Scanner(System.in);
        int initalCount = 10;
        int chances = 5;
        System.out.println("Great! You have selected the Medium difficulty level.");
        System.out.println("Let's start the game!");

        int max = 6;
        method(keyboard,initalCount,chances);
    }

    public static void Hard(){
        Scanner keyboard = new Scanner(System.in);
        int initalCount = 10;
        int chances = 3;
        System.out.println("Great! You have selected the Hard difficulty level.");
        System.out.println("Let's start the game!");

        int max = 6;
        method(keyboard,initalCount,chances);
    }

    private static void method(Scanner keyboard, int initalCount, int chances) {
        int max = 100;
        int min = 1;
        int systemNumberGuessed = (int) (Math.random() * (max - min + min)) + min;

        while (chances > 0) {
            System.out.print("\nEnter your guess: ");
            int guess = keyboard.nextInt();
            chances--;
            if (guess > systemNumberGuessed){
                System.out.println("Incorrect! The number is less than " + guess);
            } else if (guess < systemNumberGuessed) {
                System.out.println("Incorrect! The number is greater than " + guess);
            } else {
                int chancesUsed = initalCount - chances;
                System.out.println("Congratulations! You guessed the correct number in " + chancesUsed + " attempts");
                break;
            }

            if (chances == 0){
                System.out.println("Sorry: The number was " + systemNumberGuessed);
            }

        }
    }

}
