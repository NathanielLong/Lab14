package co.grandcircus;

public class FairPlayer extends Player {

	public FairPlayer() {

	}

	public FairPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		int i = (int) (Math.random() * 3) + 1;
		switch (i) {
		case 1:
			return Roshambo.Paper;
		case 2:
			return Roshambo.Rock;
		default:
			return Roshambo.Scissors;
		}
	}

	@Override
	public void setUserChoice(String input) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Roshambo generateRoshambo() {
//		return Roshambo.Rock;
//		
//	}
}
