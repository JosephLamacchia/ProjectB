package fixtures;

import game.Player;

public class Bathroom extends Fixture {

	

		public static void useToilet(int a) {

			System.out.println("Number 1[Command: 1] or Number 2[Command: 2]?");
			System.out.println();
			if(a==1) {System.out.println("You did such a good job!");}
			if(a==2) {System.out.println("Oh no! The toilet is clogged and the water wont stop flowing! You quickly leave the bathroom without washing your hands.");
							Player.setBathroomflooded(true);
							Player.setRoom("bedroom");}}
			
			
		public static void washHands() {

			   System.out.println("Your hands are now clean");
				Player.setCleanhands(true);
}
				
					
			
			
		public static void gazeIntoMirror() {
			
			System.out.println("While inspecting a picked scab on your chin you spot a crumpled piece of paper in the mirrors reflection.");
			System.out.println("You walk over an pick up the piece of paper.");
			System.out.println("It's a map!  It says that theres something behind the painting in the bedroom.");
			System.out.println();

			Player.setSawMap(true);

		}
		public static void description() {	System.out.println();
		System.out.println("You are currently in the Bathroom");
		System.out.println();
		System.out.println("There is a sink, mirror, toilet and a tub, which appears to be out of order, in this room.");
		System.out.println("There are several larges holes in the walls, from which come crawling many curious insects.");
		System.out.println("The amount of human hair on the floor and in the sink are just slightly greater that of an average bathroom.");
		
		System.out.println("What do you want to do?");
		System.out.println("Things to do: Wash hands[Command: 'hands'] , Use Toilet[Command: 'toilet'], Gaze into mirror[Command: 'mirror'], Enter Bedroom[Command: 'bedroom'] ");
	}
		
		
		
			
		}
		
			
			
			
			
	

