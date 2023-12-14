import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(add(3, 5));
        System.out.println(subtract(5, 1));
        System.out.println(multiply(5, 5));
        System.out.println(divide(10, 2));
        System.out.println(modulus(20, 3));

//       int userInput = getInteger(1, 10);
//       System.out.println("User's number is " + userInput);

//        getFactorial();
rollDice();
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        boolean outsideMinMax = true;
        int userInput = 0;

        while (outsideMinMax) {
            System.out.printf("Enter a number between %d and %d:", min, max);
            userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                outsideMinMax = false;
            } else {
                System.out.printf("You didn't enter a number between %d - %d, try again\n", min, max);
            }
        }
        return userInput;
    }

    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        boolean agree = true;

        while (agree) {
            System.out.println("Enter a number between 1-19:");
            int userNum = scanner.nextInt();

            if (userNum >= 1 && userNum <= 19) {
                int factorial = 1;

                for (int i = 2; i <= userNum; i++) {
                    factorial *= i;
                }

                System.out.println("Factorial of " + userNum + " is: " + factorial);
                scanner.nextLine();
            } else {
                System.out.println("You did not enter a number between 1-10.\n");
                scanner.nextLine();
            }

            System.out.println("Would you like to try again? (Y/N)");
            String again = scanner.nextLine();

            if (again.equalsIgnoreCase("N")) {
                agree = false;
            }
        }
    }

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are on the dice?");
        int dieSides = scanner.nextInt();
        scanner.nextLine();
        boolean rollAgain = true;
        rollDiceHelper(scanner, dieSides, rollAgain);
    }

    private static void rollDiceHelper(Scanner scanner, int dieSides, boolean rollAgain) {
        if (!rollAgain) {
            System.out.println("Thanks for playing!");
            return;
        }

        System.out.println("Ready to roll?! Type 'ROLL'!");
        String userRoll = scanner.nextLine();

        if (userRoll.equalsIgnoreCase("ROLL")) {
            int dieOneRoll = (int) (Math.random() * dieSides) + 1;
            int dieTwoRoll = (int) (Math.random() * dieSides) + 1;
            System.out.printf("\nYou have rolled a %d and a %d\n", dieOneRoll, dieTwoRoll);
        } else {
            System.out.println("\nInvalid input. Please type 'ROLL' to roll the dice.");
        }

        System.out.println("\nWould you like to roll again? Y/N");
        String again = scanner.nextLine();
        if (again.equalsIgnoreCase("N")) {
            rollAgain = false;
        }

        rollDiceHelper(scanner, dieSides, rollAgain);
    }

}
