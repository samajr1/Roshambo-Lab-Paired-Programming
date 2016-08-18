
public class HumanPlayer extends Player {
	private String humanInput; 
	public static int playerWinCount = 0;
	
	public HumanPlayer(String name, String humanInput) {
		super(name);
		this.humanInput = humanInput;
	}



	@Override
	public Roshambo generateRoshambo() {
		if (humanInput.equalsIgnoreCase("p"))
			return Roshambo.PAPER;	
		else if (humanInput.equalsIgnoreCase("r"))
			return Roshambo.ROCK;
		else if (humanInput.equalsIgnoreCase("s"))
			return Roshambo.SCISSORS;
		
		return null;
		}
	
	public void winCount(){
			playerWinCount++;
	}
	
	}

