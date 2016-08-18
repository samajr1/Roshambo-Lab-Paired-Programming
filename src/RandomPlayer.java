import java.util.Random;

public class RandomPlayer extends Player {
	public static int randomPcWinCount = 0;
	
    Random rand = new Random();
    int randomNum = rand.nextInt(3);  //random integer between 0-2.

	public RandomPlayer(String name) {
		super(name);
	}

//	@Override
	public Roshambo generateRoshambo(){
//        Random rand = new Random();
//        int randomNum = rand.nextInt(3);  //random integer between 0-2.
        
        if (randomNum == 0){
            return Roshambo.ROCK;
        }else if (randomNum == 1){
            return Roshambo.PAPER;
        }else if (randomNum == 2){
            return Roshambo.SCISSORS;
        }else
        	return null;
    
    }
	
	public void winCount(){
		randomPcWinCount++;
	}
		
}
