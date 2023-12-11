import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You've entered " + userInt);

        System.out.println("Please enter three words.\nFirst Word: ");
        String firstWord = scanner.next();
        System.out.println("Second Word: ");
        String secondWord = scanner.next();
        System.out.println("Third Word: ");
        String thirdWord = scanner.next();
        System.out.printf("Your words are: %s, %s, %s.%n", firstWord,secondWord,thirdWord);

        System.out.println("Please enter a sentence:");
        String userSkip = scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println("You've entered: " + userSentence);

        System.out.println("Enter the length of your classroom:");
        String roomLength = scanner.nextLine();
        double length = Double.parseDouble(roomLength);
        System.out.println("Enter the width of your classroom:");
        String roomWidth = scanner.nextLine();
        double width = Double.parseDouble(roomWidth);
        System.out.println("Enter the height of your classroom:");
        String roomHeight = scanner.nextLine();
        double height = Double.parseDouble(roomHeight);
        double area = length * width;
        double circumference = (length*2) + (width*2);
        double volume = length * width * height;
        System.out.printf("The area of your classroom is %.3f, the circumference is %.3f, and the volume is %.3f.", area, circumference, volume);

        scanner.useDelimiter("\n");
    }
}
