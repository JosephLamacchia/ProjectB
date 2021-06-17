package fixtures;


import game.Player;


public class Kitchen extends Fixture {


	public static void openFridge() {
		
		if(Player.isFridgeempty() == false) {
			System.out.println("Theres nothing in here but a chunk of raw meat.");
			System.out.println("Could possibly be useful.");
			System.out.println("You stick the meat in your back pocket.");
			Player.setHaveMeat(true);
			Player.setFridgeempty(true);}
		
		else if(Player.isFridgeempty() == true) {
			System.out.println("The fridge is empty");}
		}



	
	    
	
		

	
		
	public static void cookFood() {
		if(Player.isHaveMeat() == true & Player.isMeatCooked() == false) {System.out.println("You cook the meat and put it back in your back pocket");
		Player.setMeatCooked(true);
}
		else if(Player.isHaveMeat() == true & Player.isMeatCooked() == true) {System.out.println("The meat is burnt to dust ):");
		Player.setHaveMeat(false);}
		
		else {System.out.println("You have nothing to cook");
}
		
	
	}
	
		
	public static void eatFood() {
		if(Player.isHaveMeat() == true & Player.isMeatCooked() == false) {
			System.out.println("You eat the meat and soon begin to  have terrible stomach pain");
			Player.setPoisoned(true);
			Player.setHaveMeat(false);
			}
		else if(Player.isHaveMeat() == true & Player.isMeatCooked() == true) {
		{System.out.println("You eat the meat and feel well fed");
		Player.setHaveMeat(false);}
		}
		
		else {System.out.println("you have nothing to eat");}
			
	}
		

	
public static void lookThroughTrash() {
		
		if(Player.isBathroomflooded() == true & Player.isSawMap() == false) {
			System.out.println("You find a note drenched pastsa sause");
			System.out.println("You can just barely make out the words 'behind painting' ");
			Player.setSawMap(true);
		}
		else if(Player.isBathroomflooded() == false) {
			System.out.println("There doesnt seem to be anything useful in here.");

		}
		}

public static void description() {
	System.out.println();
	System.out.println("You are currently in the Kitchen");
	System.out.println();
	System.out.println("The kitchen is unpleasent.  Once-white walls are waxed with grease.");
	System.out.println("Food has been left out for what must have been a while.");
	System.out.println("A multitudonous varity of molds paint patches on the uneaten meal.");
	System.out.println("The stench is making you light-headed.");
	
	System.out.println("What do you want to do?");
	System.out.println("Things to do: Open Refrigorator[Command: 'fridge'] , Eat[Command: 'eat'], Cook[Command: 'cook'], Enter Bedroom[Command: 'bedroom'], Examine Garbage[Command: 'trash'] ");


		
	}}


