package co.grandcircus;

public class Nathaniel extends Player {

	public Nathaniel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nathaniel(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public Roshambo generateRoshambo() {
//		if (userChoice.equalsIgnoreCase("rock")) {
//			return Roshambo.Rock;
//		} else if (userChoice.equalsIgnoreCase("paper")) {
//			return Roshambo.Paper;
//		} else {
//			return Roshambo.Scissors;
//		}
//
//	}

	@Override
	public void setUserChoice(String input) {
		// TODO Auto-generated method stub
		
	}

//@Override
//public Roshambo generateRoshambo() {
//	if (getUserChoice().equalsIgnoreCase("rock")) {
//	return Roshambo.Paper;
//} else if (getUserChoice().equalsIgnoreCase("paper")) {
//	return Roshambo.Scissors;
//} else {
//	return Roshambo.Rock;
//}
//}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
		
	}

}
