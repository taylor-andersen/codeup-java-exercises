import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean stillTalking = true;

        while (stillTalking) {
            System.out.println("What would you like to say to Bob?");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure\n");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!\n");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!\n");
            } else {
                System.out.println("Whatever.\n");
            }

            System.out.println("Would you like to keep talking to Bob? Y/N");
            String continueTalking = scanner.nextLine();
            if (continueTalking.toLowerCase().endsWith("n")) {
                stillTalking = false;
            }
        }

    }
}
