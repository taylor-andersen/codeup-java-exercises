import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Code inside of curly braces should be indented");
//        System.out.println("with four spaces");
//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        id = 123;
//        isLoggedIn = false;
//        bankAccountBalance = 1000.23F;
//
//        int theAnswer = 42;
//        String question = "What is your favorite color?";
//
//        final int SIDES_OF_A_DICE = 6;
//        final String API_KEY = "b75b703d8195f6f433ca";
//        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int myFavoriteNumber = 1037;
        String myString = "My number is 1037";
        System.out.println(myString);
        float myNumber = 123;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);

//        int x = 4;
//        x = x + 5;
//        x += 4;

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: \"" + userInput + "\"");
    }
}

