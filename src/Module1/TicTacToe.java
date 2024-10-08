package Module1;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] schema = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char signer = 'X';

    public static void main(String[] args) {
        while (true){
            printBoard();
            getValidInput();
            if(checkWinner()){
                printBoard();
                System.out.println("You win,"+signer);
                break;
            }
            if (isSchemaFull()){
                System.out.println("No winner");
                break;
            }
            signer=(signer=='X')?'O':'X';
        }
    }

    private static void printBoard() {
        System.out.println("Our current schema:");
        for (char[] row : schema) {
            for (char point : row) {
                System.out.print(point + "|");
            }System.out.println();
            System.out.println("-------");
        }
    }

    private static void getValidInput() {
        Scanner scanner = new Scanner(System.in);
        int row,column;
        while (true) {
            System.out.println("Enter row and column: ");
            row = scanner.nextInt() - 1;
            column = scanner.nextInt() - 1;
            if (row >= 0 && column >= 0 && column <3 && column <3 && schema[row][column] == ' ') {
                schema[row][column] = signer;
                break;
            } else System.out.println("Invalid value,Pls try again");
        }
    }
    private static boolean checkWinner(){
        for (int i=0;i<3;i++){
            if (schema[i][0]==signer&&schema[i][1]==signer&&schema[i][2]==signer||
                    (schema[0][i]==signer&&schema[1][i]==signer&&schema[2][i]==signer)) return true;
        }
        return schema[1][1]==signer&&schema[0][0]==signer&&schema[2][2]==signer||
                (schema[0][2]==signer&&schema[1][1]==signer&&schema[2][0]==signer);
    }
    private static boolean isSchemaFull(){
        for (char[] row:schema){
            for (char point:row){
                if (point==' ') return false;
            }
        }
        return true;
    }

}
