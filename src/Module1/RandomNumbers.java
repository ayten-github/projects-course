package Module1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the begin");
        int number = random.nextInt(100);
        int[] guessNumber = new int[100];
        int count = 0;
        while (true) {

            System.out.println("enter your number");
            int guess = scanner.nextInt();
            if (count < guessNumber.length) {
                guessNumber[count] = guess;
                count++;
            }
            if (guess < number) System.out.println("Your guess is too small.Pls try again");
            else if (guess > number) System.out.println("Your guess is too big.Pls try it again");
            else {
                System.out.println("Congratulations, " + name);
                System.out.println("Your numbers: ");
                int[] sortedGuesses = new int[count];
                System.arraycopy(guessNumber, 0, sortedGuesses, 0, count);
                sorting(sortedGuesses);
                for (int sortedGuess : sortedGuesses) {
                    System.out.print(sortedGuess + " ");
                }
                break;
            }
        }

    }
    private static void sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


    }
}
