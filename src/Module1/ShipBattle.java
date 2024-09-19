package Module1;

import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static void main(String[] args) {
        char[][] schema = new char[5][5];
        Scanner scanner = new Scanner(System.in);
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
            int num1, num2;
            while (true) {
                System.out.println("Enter a number(1-5)");
                num1 = scanner.nextInt();
                if (num1 <= 5 && num1 >= 1) break;
            }
            while (true) {
                System.out.println("Enter a number(1-5)");
                num2 = scanner.nextInt();
                if (num2 >= 1 && num2 <= 5) break;
            }
            if (num1 == row && num2 == colmn) {
                System.out.println("You won!");
                schema[num1 - 1][num2 - 1] = 'x';
                printingSchema(schema);
                break;
            } else {
                schema[num1 - 1][num2 - 1] = '*';
                System.out.println("Try again pls");
                printingSchema(schema);
            }
        }
    }
    private static void printingSchema(char[][] array) {
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
