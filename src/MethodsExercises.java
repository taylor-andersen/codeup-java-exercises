import java.util.Scanner;
public class MethodsExercises {

   public static void main (String[] args) {

       System.out.println(add(3,5));
       System.out.println(subtract(5,1));
       System.out.println(multiply(5,5));
       System.out.println(divide(10, 2));
       System.out.println(modulus(20, 3));

       System.out.println(getInteger(2,100));

    }

    public static int add (int x, int y) {
       return x + y;
    }
    public static int subtract (int x, int y) {
       return x - y;
    }
    public static int multiply (int x, int y) {
       return x * y;
    }
    public static int divide (int x, int y) {
       return x / y;
    }
    public static int modulus (int x, int y) {
       return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        boolean outsideMinMax = true;

        while (outsideMinMax) {
            System.out.printf("Enter a number between %d and %d:", min, max);
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                outsideMinMax = false;
            } else {
                System.out.printf("You didn't enter a number between %d - %d, try again\n", min, max);
            }
        }
        return 0;
    }

}
