package Module1;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] weekPlan = new String[7][2];
        weekPlan[0][0] = "Sunday";
        weekPlan[0][1] = "do homework";
        weekPlan[1][0] = "Monday";
        weekPlan[1][1] = "go to courses;watch a film";
        weekPlan[2][1] = "write code;make cookies";
        weekPlan[2][0] = "Tuesday";
        weekPlan[3][0] = "Wednesday";
        weekPlan[3][1] = "go to courses;read book";
        weekPlan[4][0] = "Thursday";
        weekPlan[4][1] = "meet friends";
        weekPlan[5][0] = "Friday";
        weekPlan[5][1] = "play volleyball";
        weekPlan[6][0] = "Saturday";
        weekPlan[6][1] = "draw pictures";
        while (true) {
            System.out.println("Enter the day of week or exit pls");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("you exited the program.");
                break;
            }
            boolean flag = true;
            for (int i = 0; i < 7; i++) {
                if (input.equalsIgnoreCase(weekPlan[i][0])) {
                    System.out.println("Your tasks for " + weekPlan[i][0] + " " + weekPlan[i][1]);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Sorry,i didn't understand you.Pls try again");
        }
    }
}
