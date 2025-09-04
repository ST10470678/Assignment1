package com.mycompany.progassignmentprt2;
import java.util.Scanner;

public class Progassignmentprt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play Tic-Tac-Toe? (Y/N)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            GameBoard game = new GameBoard();
            char currentPlayer = 'X';
            boolean gameWin = false;

            while (!gameWin && !game.fullBoard()) {
                game.showBoard();
                System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2):");

                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (game.move(row, col, currentPlayer)) {
                    if (game.checkTheWinner(currentPlayer)) {
                        game.showBoard();
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameWin = true;
                    } else {
                        // Switch players
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            if (!gameWin) {
                game.showBoard();
                System.out.println("Draw!");
            }

        } else {
            System.out.println("Maybe next time! Goodbye.");
        }

        scanner.close();
    }
}

/*
Refrence list:
Farrell, J., 2022. Java Programming. 10th ed. Boston, MA: Cengage Learning US.
*/

