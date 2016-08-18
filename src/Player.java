
public abstract class Player {
	private String name; 
	private Roshambo value; 
	
	public Player(){
		
	}
	
	
	public Player(String name) {
		this.name = name;
	}



	public abstract Roshambo generateRoshambo();
	
	public abstract void winCount();



	public String getName() {
		return name;
	}
	
	
}
