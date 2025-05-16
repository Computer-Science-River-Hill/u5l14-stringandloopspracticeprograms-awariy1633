package org.example; 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Further Substring Fun");
            System.out.println("2. Run of Integers");
            System.out.println("3. Sum of a Range of Sequential Integers");
            System.out.println("4. Repeatedly Echo a Word");
            System.out.println("5. Words Separated by Dots");
            System.out.println("6. Adding Up Integers");
            System.out.println("7. Shipping Cost Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1: substringFun(scanner); break;
                case 2: runOfIntegers(scanner); break;
                case 3: sumOfRange(scanner); break;
                case 4: echoWord(scanner); break;
                case 5: wordsWithDots(scanner); break;
                case 6: addIntegers(scanner); break;
                case 7: shippingCost(scanner); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void substringFun(Scanner scanner) {
        System.out.println("Enter a string:");
        String original = scanner.nextLine();
        System.out.println("Enter beginning index:");
        int begin = scanner.nextInt();
        System.out.println("Enter ending index:");
        int end = scanner.nextInt();
        scanner.nextLine();
        String sub = original.substring(begin, end);
        System.out.println("Original string: " + original);
        System.out.println("Substring: " + sub);
    }

    public static void runOfIntegers(Scanner scanner) {
        System.out.println("Enter Start:");
        int start = scanner.nextInt();
        System.out.println("Enter End:");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void sumOfRange(Scanner scanner) {
        System.out.println("Enter low:");
        int low = scanner.nextInt();
        System.out.println("Enter high:");
        int high = scanner.nextInt();
        int sumToHigh = high * (high + 1) / 2;
        int sumToLowMinus1 = (low - 1) * low / 2;
        int result = sumToHigh - sumToLowMinus1;
        System.out.println("Sum = " + result);
    }

    public static void echoWord(Scanner scanner) {
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }

    public static void wordsWithDots(Scanner scanner) {
        System.out.println("Enter first word:");
        String word1 = scanner.nextLine();
        System.out.println("Enter second word:");
        String word2 = scanner.nextLine();
        int totalLength = 30;
        int dotsCount = totalLength - (word1.length() + word2.length());
        System.out.print(word1);
        for (int i = 0; i < dotsCount; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }

    public static void addIntegers(Scanner scanner) {
        System.out.println("How many integers will be added:");
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter an integer:");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("The sum is " + sum);
    }

    public static void shippingCost(Scanner scanner) {
        while (true) {
            System.out.println("Weight of Order:");
            int weight = scanner.nextInt();
            if (weight <= 0) {
                System.out.println("bye");
                break;
            }
            double cost = 3.00;
            if (weight > 10) {
                cost += (weight - 10) * 0.25;
            }
            System.out.printf("Shipping Cost: $%.2f%n", cost);
        }
    }
}
