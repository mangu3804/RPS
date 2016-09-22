package winpaperscissors;

/*
 * Rock Paper Scissors
 * By Madison Nguyen (mangu3804)
 * September 13, 2016 - Start
 * September 19, 2016 - Latest
 */

import java.util.Scanner;
import java.util.Random;

public class WinPaperScissors {

    public static void main(String[] args) {
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        int playerThrow, computerThrow;
        int playerScore = 0, computerScore = 0, gameCount = 0;

        Scanner input = new Scanner(System.in);;
        Random roll = new Random();;

        boolean rerun = true;
        boolean inputError = false;

        while (rerun) {
            if (inputError == false) {
                gameCount++;
                System.out.println("Game " + gameCount);
                
                /* Prompt player for action */
                System.out.println("Enter your action");
                System.out.print("1=Rock 2=Paper 3=Scissors or 4=End: ");
            } else {
                System.out.print("\tInvalid input! Try again: ");
                
            }
            
            playerThrow = input.nextInt();

            if (playerThrow > 4 || playerThrow <1) {
                inputError = true;
            } else if (playerThrow == 4) {
                rerun = false;
                System.out.println("Thanks for playing!");
            } else {
                inputError = false;
                
                /* Generate computer throw */
                computerThrow = roll.nextInt(3) + 1;
                /* ramom number between 1 and 3 */

                /* Display throw choices */
                System.out.print("Player throws ");
                switch (playerThrow) {
                    case ROCK:
                        System.out.println("ROCK.");
                        break;
                    case PAPER:
                        System.out.println("PAPER.");
                        break;
                    case SCISSORS:
                        System.out.println("SCISSORS.");
                }
                System.out.print("Computer throws ");
                switch (computerThrow) {
                    case ROCK:
                        System.out.println("ROCK.");
                        break;
                    case PAPER:
                        System.out.println("PAPER.");
                        break;
                    case SCISSORS:
                        System.out.println("SCISSORS.");
                }

                /*Determine winner */
                switch (playerThrow) {
                    case ROCK:
                        switch (computerThrow) {
                            case ROCK:
                                System.out.println("It's a draw!");
                                break;
                            case PAPER:
                                System.out.println("Computer wins!");
                                computerScore++;
                                break;
                            case SCISSORS:
                                System.out.println("Player wins!");
                                playerScore++;
                        }
                        break;
                    case PAPER:
                        switch (computerThrow) {
                            case ROCK:
                                System.out.println("Player wins!");
                                playerScore++;
                                break;
                            case PAPER:
                                System.out.println("It's a draw!");
                                break;
                            case SCISSORS:
                                System.out.println("Computer wins!");
                                computerScore++;
                        }
                        break;
                    case SCISSORS:
                        switch (computerThrow) {
                            case ROCK:
                                System.out.println("Computer wins!");
                                computerScore++;
                                break;
                            case PAPER:
                                System.out.println("Player wins!");
                                playerScore++;
                                break;
                            case SCISSORS:
                                System.out.println("It's a draw!");
                        }
                }
                System.out.println("Player Score: " + playerScore);
                System.out.println("Computer Score: " + computerScore + "\n");
            }
        }
        input.close();
    }
}



