package fixtures;

import game.Player;

public class Lair extends Fixture {
	public static void description() {	System.out.println();
	System.out.println("You are currently in the lair of Mr. Big Bad Bussiness Bill");
	System.out.println();
	System.out.println("You recognize the man across from you as the man in the painting though clearly much older");
	System.out.println("He is Mr. Big Bad Bussiness Bill and he's been living secretly in Joe's studio apartment since before");
	System.out.println("Joe himself moved in.");
	System.out.println("You know what you have to do.");
	System.out.println();

	
	System.out.println("What do you want to do?");
	System.out.println();
	System.out.println("Things to do: Approach Big Bad Bussiness Bill[Command: 'approach'], Go back upstairs[Command: 'stairs']");}
	
	public static void approachBadBill(){

		loop :while(Player.isDead() == false) {
		System.out.print("'You're a fool for coming to Joe's studio apartment.");
		System.out.print("'Many an adventurer much stronger than you have met their end here!'");
		System.out.println();
		System.out.print("'Don't take this personally it's just...BUSSINESS!!'");
		System.out.print("Mr Big Bussiness removes his tie and bradishes a greatsword");
		
		//Poisoning loss
		if(Player.isPoisoned() == true) {System.out.print("The pain in your stomach becomes overwelming.  You fall to your knees.");
			System.out.print("Mr Big Bussiness dispatches you with one swing of his sword");
			System.out.print("GAME OVER");
			Player.setDead(true);
			break;
}
		
		
		//Bathroom flooding win 
		if(Player.isBathroomflooded()==true & Player.isDead() == false) {
			System.out.println();
			System.out.println();
			System.out.println("You and your foe are both distracted by a loud creaking noise.");
			System.out.println("As both of you look up the ceiling above Mr Big Bad Bussiness Bill collapses drenching him in toilet water");
			System.out.println("'My Suit!!!', He yells.  And melts into the ground below.");
			System.out.println("You've done it!  The Evil Mr Big Bad Bussiness Bill has been vanquished. But you should probably leave since Joe is comming home soon.");
			Player.setDead(true);
			break loop;}

				
			
			
			
	
		else if(Player.hasCleanhands() == true & Player.isWellfed() == true & Player.isWellrested() == true & Player.isDead() == false ) {
				
					
					
			System.out.println("Mr Big Bussiness' phone begins to ring.  He looks to you. ");
			System.out.println("'Sorry I need to take this'");
			System.out.println("You take this chance and grab his greatsword");
			System.out.println("You kill Mr Big Bussiness with his own sword ");

						
			System.out.println("You've done it!  The Evil Mr Big Bissiness has been vanquished. But you should probably leave since Joe is comming home soon.");
			Player.setDead(true);
			break loop;

					}
		
		
		else{double x = Math.random();
			if(x>.7) {
				System.out.println("Mr Big Bad Bussiness Bill's phone begins to ring.  He looks to you. ");
				System.out.println("'Sorry I need to take this'");
				System.out.println("You take this chance and grab his greatsword");
				System.out.println("You kill Mr Big Bad Bussiness Bill with his own sword ");
				System.out.println("You've done it!  The Evil Mr Big Bissiness has been vanquished. But you should probably leave since Joe is comming home soon.");
				Player.setDead(true);
				break loop;
			}
			
			else {System.out.println("Mr Big Bad Bussiness Bill' phone begins to ring.  He looks to you. ");
			System.out.println("'Sorry I need to take this'");
			System.out.println("You take this chance and grab his greatsword");

			System.out.println("Unfortunatly it's too heavy for you ");
			System.out.println("Mr Big Bad Bussiness Bill hangs up his call and starts laguhing at you.  Your face turns red.");
			System.out.println("Big Bad Bill Beat your Bones Broken ):");
			Player.setDead(true);
			break loop;


			
}
				}
		}
		}
						
		

}
