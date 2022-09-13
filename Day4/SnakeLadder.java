package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeLadder {

	public static void main(String[] args) {
		BufferedReader myInput2 = new BufferedReader(new InputStreamReader(System.in));

		String sGame = "r";

		System.out.print("Press r to roll dice");
		try {
			sGame = myInput2.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while (sGame.equals("r") || sGame.equals("R")) {
			try {
				sGame = startGame(sGame);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Bye...");

	}

	public static String startGame(String start) throws IOException {

		BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
		int player1Position = 1;
		int player2Position = 1;
		int diceRoll = 0;
		int diceRoll2 = 0;
		int player1Roll = 1;
		int player2Roll = 1;
		String playAgain = "r";

		int snakesLaddersArray[] = new int[6];
		snakesLaddersArray[0] = 54;
		snakesLaddersArray[1] = 90;
		snakesLaddersArray[2] = 99;
		snakesLaddersArray[3] = 9;
		snakesLaddersArray[4] = 40;
		snakesLaddersArray[5] = 67;

		while (playAgain.equals("r") || playAgain.equals("R")) {

			player1Roll = getDice(diceRoll, diceRoll2);
			player2Roll = getDice(diceRoll, diceRoll2);
			System.out.println("Player1 Rolled a " + player1Roll);
			System.out.println("The Player2 Rolled a " + player2Roll);
			System.out.println();

			player1Position = player1Position + player1Roll;

			player2Position = player2Position + player2Roll;

			player1Position = player1GetP(player1Position, player1Roll, snakesLaddersArray, player2Position);

			player2Position = player2GetP(player2Position, player2Roll, snakesLaddersArray, player1Position);

			System.out.println();
			System.out.println("Player1 are currently on square " + player1Position);
			System.out.println("The Player2 is currently on square " + player2Position);
			System.out.println();

			if (player1Position == 100 || player2Position == 100) {
				player1Position = 1;
				player2Position = 1;
				System.out.print("Do you want to play again???? press r to roll dice...");
				playAgain = myInput.readLine();
				System.out.println();
			} else {
				System.out.print("Press r to roll dice");
				playAgain = myInput.readLine();

			}

		}

		return playAgain;
	}

	public static int getDice(int diceRoll, int diceRoll2) {
		diceRoll = (int) (Math.random() * 6) + 1;
		diceRoll2 = (int) (Math.random() * 6) + 1;
		int move = diceRoll + diceRoll2;
		return move;
	}

	public static int player1GetP(int player1Position, int player1Roll, int snakesLaddersArray[], int player2Position)
			throws IOException {

		if (player1Position == snakesLaddersArray[0]) {
			player1Position = 19;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");
		} else if (player1Position == snakesLaddersArray[1]) {
			player1Position = 48;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");

		} else if (player1Position == snakesLaddersArray[2]) {
			player1Position = 77;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");
		} else if (player1Position == snakesLaddersArray[3]) {
			player1Position = 34;
			System.out.println("You Got A Ladder!! GO UP!");

		} else if (player1Position == snakesLaddersArray[4]) {
			player1Position = 64;
			System.out.println("Player1 Got A Ladder!! GO UP!");

		} else if (player1Position == snakesLaddersArray[5]) {

			player1Position = 86;
			System.out.println("Player1 Got A Ladder!! GO UP!");
		}

		if (player1Position < 0 || player1Position > 112) {
			System.out.println("An error has occured for the player1, please reset the game!!!!!!");
		}

		else if (player1Position > 100) {
			player1Position = player1Position - player1Roll;
			System.out.println("OHHH Player1 cant jump, Player1 must land on a 100");

		} else if (player1Position == 100 && player2Position != 100) {
			System.out.println("Player1 WON, Player2 FAILED!!!");

		}

		return player1Position;
	}

	public static int player2GetP(int player2Position, int player2Roll, int snakesLaddersArray[], int player1Position)
			throws IOException {

		if (player2Position == snakesLaddersArray[0]) {
			player2Position = 19;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");

		} else if (player2Position == snakesLaddersArray[1]) {
			player2Position = 48;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");

		} else if (player2Position == snakesLaddersArray[2]) {
			player2Position = 77;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");
		} else if (player2Position == snakesLaddersArray[3]) {
			player2Position = 34;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");
		} else if (player2Position == snakesLaddersArray[4]) {
			player2Position = 64;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");

		} else if (player2Position == snakesLaddersArray[5]) {
			player2Position = 86;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");
		}

		if (player2Position < 0 || player2Position > 112) {
			System.out.println("An error has occured for the Player2, please reset the game!!!!!!");
		}

		else if (player2Position > 100) {
			player2Position = player2Position - player2Roll;
			System.out.println("THE Player2 CAN'T JUMP!!! He must land on a 100");

		} else if (player2Position == 100 && player1Position != 100) {
			System.out.println("THE Player2 WON, Player1 FAILED!!!");

		}

		return player2Position;
	}

}
