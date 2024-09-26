package Module1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the begin");
        int number = random.nextInt(101);
        int[] guessNumber = new int[100];
        int count = 0;
        while (true) {

            System.out.println("Enter your number");
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
                Arrays.sort(sortedGuesses);
                reverseArray(sortedGuesses);
                break;
            }

        }

    }

    public static void reverseArray(int arr[]) {
        int reversedNumber;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            reversedNumber = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = reversedNumber;
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
