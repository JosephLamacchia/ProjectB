package fixtures;

import game.Player;

public class Bedroom extends Fixture {

	public static void takeNap() {
		System.out.println();
		System.out.println("You wake up feeling well rested.");
		System.out.println();

			}



	public static void examinePainting(){
		if( game.Player.isSawMap() == true) {
			System.out.println();
			System.out.println("You take the painting off the wall revealing a hidden staircase"); 
			System.out.println("You descend the stairs"); 
			System.out.println();
			Player.setRoom("lair");

		}
		else if(game.Player.isSawMap() == false) {
			System.out.println();
			System.out.println("You admire the painting and think yourself very intelligent for doing do.");
			System.out.println();

			
		}
		
			
		}
	public static void description() {	System.out.println();
	System.out.println("You are currently in the Bedroom");
	System.out.println();
	System.out.println("There is not much to say about this room.  The only objects of note are");
	System.out.println("twin matress in the corner of the room and the portrait of a man in a suit");
	System.out.println("directly over it.");
	System.out.println("The room connects to the kitchen and the bathroom.");
	System.out.println();

	
	System.out.println("What do you want to do?");
	System.out.println();

	System.out.println("Things to do: Open Examine Painting[Command: 'painting'] , Take Nap[Command: 'nap'], Enter Bathroom[Command: 'bathroom'], Enter Kitchen[Command: 'kitchen'] ");
}
	

	}

