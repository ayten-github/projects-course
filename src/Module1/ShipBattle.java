package Module1;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] schema = new char[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                schema[i][j] = '-';
            }
        }
        int row = random.nextInt(5) + 1;
        int colmn = random.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            int num1 = getValidInput();
            int num2 = getValidInput();
            if (num1 == row && num2 == colmn) {
                System.out.println("You won!");
                schema[num1 - 1][num2 - 1] = 'x';
                printSchema(schema);
                break;
            } else {
                schema[num1 - 1][num2 - 1] = '*';
                System.out.println("Try again pls");
                printSchema(schema);
            }
        }
    }

    private static int getValidInput() {
        int num;
        while (true) {
            System.out.println("Enter a number (1-5): ");
            num = scanner.nextInt();
            if (num >= 1 && num <= 5) break;
            System.out.println("Invalid value.Pls enter again");

        }
        return num;
    }

    private static void printSchema(char[][] array) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
