
public enum Roshambo {
ROCK,
PAPER,
SCISSORS;
	
	public String compare(Roshambo x){
		if (this == x)
		return "Draw!"; 
		
		switch(this){
		case ROCK: return x==Roshambo.PAPER ? 		"Lose"	:"Win!"; 
		case PAPER: return x==Roshambo.SCISSORS ? 	"Lose"	:"Win!";
		case SCISSORS: return x==Roshambo.ROCK ? 	"Lose"	:"Win!"; 
		default: return null; 
		}
		
	}
	@Override
	public String toString(){
		return "played " + super.toString();
	}
	
}
