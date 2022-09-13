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
		int userPosition = 1;
		int user2Position = 1;
		int diceRoll = 0;
		int diceRoll2 = 0;
		int userRoll = 1;
		int user2Roll = 1;
		String playAgain = "r";

		int snakesLaddersArray[] = new int[6];
		snakesLaddersArray[0] = 54;
		snakesLaddersArray[1] = 90;
		snakesLaddersArray[2] = 99;
		snakesLaddersArray[3] = 9;
		snakesLaddersArray[4] = 40;
		snakesLaddersArray[5] = 67;

		while (playAgain.equals("r") || playAgain.equals("R")) {

			userRoll = getDice(diceRoll, diceRoll2);
			user2Roll = getDice(diceRoll, diceRoll2);
			System.out.println("Player1 Rolled a " + userRoll );
			System.out.println("The Player2 Rolled a " + user2Roll);
			System.out.println();

			userPosition = userPosition + userRoll;

			user2Position = user2Position + user2Roll;

			userPosition = getP(userPosition, userRoll, snakesLaddersArray);

			user2Position = compgetP(user2Position, user2Roll, snakesLaddersArray, userPosition);

			System.out.println();
			System.out.println("Player1 are currently on square " + userPosition);
			System.out.println("The Player2 is currently on square " + user2Position );
			System.out.println();

			if (userPosition == 100 || user2Position == 100) {
				userPosition = 1;
				user2Position = 1;
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

	public static int getP(int userPosition, int userRoll, int snakesLaddersArray[]) throws IOException {

		if (userPosition == snakesLaddersArray[0]) {
			userPosition = 19;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");
		} else if (userPosition == snakesLaddersArray[1]) {
			userPosition = 48;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");

		} else if (userPosition == snakesLaddersArray[2]) {
			userPosition = 77;
			System.out.println("Player1 Got Bit By A Snake, GO DOWN!");
		} else if (userPosition == snakesLaddersArray[3]) {
			userPosition = 34;
			System.out.println("You Got A Ladder!! GO UP!");

		} else if (userPosition == snakesLaddersArray[4]) {
			userPosition = 64;
			System.out.println("Player1 Got A Ladder!! GO UP!");

		} else if (userPosition == snakesLaddersArray[5]) {

			userPosition = 86;
			System.out.println("Player1 Got A Ladder!! GO UP!");
		}

		if (userPosition < 0 || userPosition > 112) {
			System.out.println("An error has occured for the player1, please reset the game!!!!!!");
		}

		else if (userPosition > 100) {
			userPosition = userPosition - userRoll;
			System.out.println("OHHH Player1 cant jump, Player1 must land on a 100");

		} else if (userPosition == 100) {
			System.out.println("Player1 WON, Player2 FAILED!!!");

		}

		return userPosition;
	}

	public static int compgetP(int user2Position, int user2Roll, int snakesLaddersArray[], int userPosition)
			throws IOException {

		if (user2Position == snakesLaddersArray[0]) {
			user2Position = 19;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");

		} else if (user2Position == snakesLaddersArray[1]) {
			user2Position = 48;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");

		} else if (user2Position == snakesLaddersArray[2]) {
			user2Position = 77;
			System.out.println("Player2 Got Bit By A Snake, HE WENT GO DOWN!");
		} else if (user2Position == snakesLaddersArray[3]) {
			user2Position = 34;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");
		} else if (user2Position == snakesLaddersArray[4]) {
			user2Position = 64;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");

		} else if (user2Position == snakesLaddersArray[5]) {
			user2Position = 86;
			System.out.println("Player2 Got TO A Ladder, HE WENT UP!!!");
		}

		if (user2Position < 0 || user2Position > 112) {
			System.out.println("An error has occured for the Player2, please reset the game!!!!!!");
		}

		else if (user2Position > 100) {
			user2Position = user2Position - user2Roll;
			System.out.println("THE Player2 CAN'T JUMP!!! He must land on a 100");

		} else if (user2Position == 100 && userPosition != 100) {
			System.out.println("THE Player2 WON, Player1 FAILED!!!");

		}

		return user2Position;
	}

}
