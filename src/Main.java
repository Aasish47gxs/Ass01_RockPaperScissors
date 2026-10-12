import java.util.Scanner;
 class Ass01RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;
        boolean validMove;
        boolean keepPlaying = true;

        // Outer do-while loop: controls whether the user wants to play again
        do {
            // ===== Get a valid move from Player A =====
            do {
                System.out.print("Player A, enter your move (R, P, or S): ");
                playerA = in.next().toUpperCase();  // convert to uppercase so r/p/s also work

                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                    validMove = false;
                }
            } while (!validMove);

            // ===== Get a valid move from Player B =====
            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                playerB = in.next().toUpperCase();

                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                    validMove = false;
                }
            } while (!validMove);

            // ===== Determine the winner and display the result =====
            System.out.println();  // blank line for readability

            if (playerA.equals(playerB)) {
                // Tie
                System.out.println(playerA + " vs " + playerB + " → It's a Tie!");
            } else if (playerA.equals("R")) {
                if (playerB.equals("S")) {
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player A wins!");
                } else { // playerB is P
                    System.out.println("Paper covers Rock");
                    System.out.println("Player B wins!");
                }
            } else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("Paper covers Rock");
                    System.out.println("Player A wins!");
                } else { // playerB is S
                    System.out.println("Scissors cut Paper");
                    System.out.println("Player B wins!");
                }
            } else { // playerA is S
                if (playerB.equals("P")) {
                    System.out.println("Scissors cut Paper");
                    System.out.println("Player A wins!");
                } else { // playerB is R
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player B wins!");
                }
            }

            // ===== Ask if the user wants to play again =====
            System.out.println();
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.next().toUpperCase();

            if (playAgain.equals("N")) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
            // If they type anything other than N (including Y), the outer loop continues

        } while (keepPlaying);

        in.close();
    }
}
