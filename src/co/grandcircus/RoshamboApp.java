package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Player opponent = null;
		String userName;
		String choice;
		char repeat = 'y';

		System.out.println("Welcome to Roshambo!");
		userName = Validator.getString(scnr, "Please enter you name: ");
		while (repeat == 'y') {
			System.out.println("Would you like to play against FairPlayer or RockBoi: ");
			choice = scnr.next().toLowerCase();
			
			switch (choice) {
			case "fairplayer":
				opponent = new FairPlayer("Kyle");

				break;
			case "rockboi":
				opponent = new Nathaniel("RockBoi");

				break;
			default:
				System.out.println("Please enter either 'FairPlayer' or 'Nathaniel'...");
			}
			System.out.println("Rock, Paper or Scissors?");
			String input = scnr.next();
			
			Player user = new MainPlayer(userName);
			user.setUserChoice(input);
			
			Roshambo userRo = user.generateRoshambo();
			Roshambo opponetRo = opponent.generateRoshambo();
			
			System.out.println();
			System.out.println(userName + " : " + userRo);
			System.out.println(opponent.getName() + " : " + opponetRo);
			Player winner = getWinner(user,opponent, userRo, opponetRo);
			System.out.println(winner);
			
			

			System.out.println("Would you like to try again? (y/n): ");
			repeat = scnr.next().charAt(0);
		}
		System.out.println("Goodbye!");
		scnr.close();
	}

	public static Player getWinner(Player player1, Player player2, Roshambo r1, Roshambo r2) {

		if (r1.equals(Roshambo.Rock) && r2.equals(Roshambo.Scissors) || r1.equals(Roshambo.Scissors) && r2.equals(Roshambo.Rock)
				|| r1.equals(Roshambo.Paper) && r2.equals(Roshambo.Rock)) {
			return player1;
		} else if (r1.equals(r2)) {
			System.out.println("It's a Tie!");
			return null;
		} else {
			return player2;
		}

	}

}
