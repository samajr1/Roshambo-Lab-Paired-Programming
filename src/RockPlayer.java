
public class RockPlayer extends Player {
	public static int rockPcWinCount = 0;

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	
	public void winCount(){
		rockPcWinCount++;
	}
	
}

	
	

	
	
	
	