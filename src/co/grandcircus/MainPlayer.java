package co.grandcircus;

public class MainPlayer extends Player {

	private String userChoice;
	
	public MainPlayer(String userName) {
		
	}

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public Roshambo generateRoshambo() {
		if (userChoice.equalsIgnoreCase("rock")) {
			return Roshambo.Rock;
		} else if (userChoice.equalsIgnoreCase("paper")) {
			return Roshambo.Paper;
		} else {
			return Roshambo.Scissors;
		}

	}

	@Override
	public String toString() {
		return "MainPlayer userChoice =" + userChoice;
	}
	
	

}
