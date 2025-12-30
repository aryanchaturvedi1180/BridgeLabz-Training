package scenario_based;
import java.util.Random;
public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int WIN_POSITION = 100;

    public static void main(String[] args) {

        Random random = new Random();

        int player1Position = 0;
        int player2Position = 0;

        int diceCount = 0;
        boolean isPlayer1Turn = true;

        System.out.println("Snake and Ladder Game Started");
        System.out.println("--------------------------------");

        while (player1Position != WIN_POSITION && player2Position != WIN_POSITION) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3);
            diceCount++;

            if (isPlayer1Turn) {
                System.out.println("\nPlayer 1 rolls dice: " + dice);
                player1Position = playTurn(player1Position, dice, option);
                System.out.println("Player 1 Position: " + player1Position);

                if (option != LADDER) {
                    isPlayer1Turn = false;
                }
            } else {
                System.out.println("\nPlayer 2 rolls dice: " + dice);
                player2Position = playTurn(player2Position, dice, option);
                System.out.println("Player 2 Position: " + player2Position);

                if (option != LADDER) {
                    isPlayer1Turn = true;
                }
            }
        }

        System.out.println("\n--------------------------------");
        System.out.println("Game Over!");
        if (player1Position == WIN_POSITION) {
            System.out.println(" Player 1 Won the Game!");
        } 
        else {
            System.out.println("Player 2 Won the Game!");
        }
        System.out.println("Total Dice Rolls: " + diceCount);
    }

    static int playTurn(int position, int dice, int option) {

        switch (option) {
            case NO_PLAY:
                // No movement
                break;

            case LADDER:
                if (position + dice <= WIN_POSITION) {
                    position += dice;
                }
                break;

            case SNAKE:
                position -= dice;
                if (position < 0) {
                    position = 0;
                }
                break;
        }
        return position;
    }
}
/*UC	Implemented
UC 1	Dice roll using RANDOM (1–6)
UC 2	Random option: No Play / Ladder / Snake
UC 3	Repeat till 100
UC 4	Exact 100 condition
UC 5	Dice count & position after every roll
UC 6	2 Players
UC 7	Ladder → extra chance + winner*/
