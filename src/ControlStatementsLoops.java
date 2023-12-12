import java.util.Scanner;

public class ControlStatementsLoops {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }

//        long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


        //FIZZBUZZ
        for (int i = 0; i <101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userNum = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number  | squared  | cubed  ");
        System.out.println("------  | -------  | -----  ");
        for (int i =1; i <= userNum; i++) {
            int square = i * i;
            int cubed = (i * i) * i;
            System.out.printf("  %d     |    %d     |   %d   \n", i, square, cubed);
        }

        System.out.println("Give me a number between 0 and 100");
        int grade = scanner.nextInt();
        System.out.printf("You've chosen %d \n", grade);
        System.out.println("Would you like to see your letter grade? 'Y/N'");
        String letter = scanner.next();
        if (letter.equals("Y")) {
            if (grade > 94) {
                System.out.println("You've gotten an A+");
            } else if (grade > 87) {
                System.out.println("You've gotten an A-");
            } else if (grade > 84) {
                System.out.println("You've gotten a B+");
            } else if (grade > 79) {
                System.out.println("You've gotten a B-");
            } else if (grade > 72) {
                System.out.println("You've gotten a C+");
            } else if (grade > 66) {
                System.out.println("You've gotten a C-");
            } else if (grade > 63) {
                System.out.println("You've gotten a D+");
            } else if (grade > 59) {
                System.out.println("You've gotten a D+");
            } else {
                System.out.println("You've gotten a F");
            }
        }
    }

}
