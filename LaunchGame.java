import java.util.Scanner;

class Guesser {
	int guessNum;

	public int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mr. Guesser Kindly guess the number between 0-100");
		guessNum = scan.nextInt();

		while ((guessNum < 0 || guessNum > 100)) {
			System.out.println("Mr. Guesser re-enter a number between 0 and 100");
			guessNum = scan.nextInt();
		}

		return guessNum;
	}
}

class Player {
	int pGuessNum;

	public int guessNumber(int num) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Mr. Player " + num + " Kindly guess the number between 0-100");
		pGuessNum = scan1.nextInt();
		while ((pGuessNum < 0 || pGuessNum > 100)) {
			System.out.println("Mr. Player re-enter a number between 0 and 100");
			pGuessNum = scan1.nextInt();
		}
		return pGuessNum;
	}

}

class Umpire {

	int numGusser;
	int numPlayer1;
	int numPlayer2;
	int numPlayer3;

	public void collectNumGuesser() {
		Guesser g = new Guesser();
		numGusser = g.guessNumber();
	}

	public void collectNumPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numPlayer1 = p1.guessNumber(1);
		numPlayer2 = p2.guessNumber(2);
		numPlayer3 = p3.guessNumber(3);
	}

	public void compare() {
		if (numGusser == numPlayer1) {
			if (numPlayer1 == numPlayer2 && numPlayer1 == numPlayer3) {
				System.out.println("Game Tied!! All Players won!!");
			} else if (numPlayer1 == numPlayer2) {
				System.out.println("Player 1 and Player 2 won the game");
			} else if (numPlayer1 == numPlayer3) {
				System.out.println("Player 1 and Player 3 won the game");
			} else {
				System.out.println("Player 1 won the Game");
			}
		} else if (numGusser == numPlayer2) {
			if (numPlayer2 == numPlayer3) {
				System.out.println("Player 2 and Player 3 won");
			} else {
				System.out.println("Player 2 won the Game");
			}
		} else if (numGusser == numPlayer3) {
			System.out.println("Player 3 won the Game");
		} else {
			System.out.println("Game Lost! Try again");
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess Game!!!!!");
		Umpire u = new Umpire();
		u.collectNumGuesser();
		u.collectNumPlayer();
		u.compare();

	}

}
