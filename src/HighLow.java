import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNum = (int) (Math.random() * 100) + 1;
        int maxGuesses = 5;

        playGame(scanner, gameNum, maxGuesses);
    }

    public static void playGame(Scanner scanner, int targetNumber, int remainingGuesses) {
        if (remainingGuesses <= 0) {
            System.out.println("Too many guesses, you lose!");
            return;
        }

        System.out.println("Try to guess the random number!");
        int userNum = scanner.nextInt();

        if (userNum > targetNumber) {
            System.out.println("LOWER");
        } else if (userNum < targetNumber) {
            System.out.println("HIGHER");
        } else {
            System.out.println("YOU GOT IT! GOOD GUESS!");
            return;
        }
        playGame(scanner, targetNumber, remainingGuesses - 1);
    }
}
