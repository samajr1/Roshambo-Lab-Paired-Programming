import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Rock Paper Scissors!");
		
		System.out.println("Enter your name: "); 
		String name = in.nextLine(); 
		
		System.out.println("Would you like play against MrRobot or TheShark (R/S)? ");
		String pcPlayer = in.nextLine();
		
		boolean valid = true;
		do {
			
			if (pcPlayer.equalsIgnoreCase("R")) {
				RandomPlayer pcPlayerObject = new RandomPlayer("Mr. Robot");
				System.out.println("Rock, paper, or scissors? (R/P/S)");
				String humanInput = in.nextLine();
				
				do {
					if (!(humanInput.equalsIgnoreCase("R") || humanInput.equalsIgnoreCase("P")
							|| humanInput.equalsIgnoreCase("S"))) {
						System.out.print("That is not a valid choice.  Try again: ");
						valid = false;
					} 
				} while (valid);
				
				HumanPlayer player = new HumanPlayer(name, humanInput);

				System.out.println(pcPlayerObject.getName() + ": " + pcPlayerObject.generateRoshambo());
				System.out.println(player.getName() + ": " + player.generateRoshambo());

				System.out.println("You " + player.generateRoshambo().compare(pcPlayerObject.generateRoshambo()));

			}else if(pcPlayer.equalsIgnoreCase("S")){
				RockPlayer pcPlayerObject = new RockPlayer("TheShark");
				System.out.println("Rock, paper, or scissors? (R/P/S)");
				String humanInput = in.nextLine();

				HumanPlayer player = new HumanPlayer(name, humanInput);

				System.out.println(pcPlayerObject.getName() + ": " + pcPlayerObject.generateRoshambo());
				System.out.println(player.getName() + ": " + player.generateRoshambo());

				System.out.println("You " + player.generateRoshambo().compare(pcPlayerObject.generateRoshambo()));
				
			}else{
				System.out.print("That is not a valid choice.  Try again: ");
				valid = false;
			}
				
		} while (!valid);
		
		
		in.close();
	}
	
	

}
