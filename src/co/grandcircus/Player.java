package co.grandcircus;

public abstract class Player {
	
	private String name;
	private String userChoice;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();
	

	@Override
	public String toString() {
		return "You's a loser...";
	}

	public Roshambo generateRoshambo(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
}
