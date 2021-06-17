package game;

import java.util.Scanner;

import fixtures.Bathroom;
import fixtures.Bedroom;
import fixtures.Kitchen;
import fixtures.Lair;
public class Main extends Player {

			
			

	
	
	
	public static void main(String[] args) {
	
	 while(isDead() == false) {

	 Scanner scan = new Scanner(System.in);
		outer: switch(getCurrentRoom()) {
		

			case "bedroom":
		    		Bedroom.description();
				    String s2 =scan.next();
				
				switch(s2) {
				
					case "painting" : Bedroom.examinePainting();
									  break outer;
				
					case "nap" :Bedroom.takeNap();
							setWellrested(true);
							break outer;

					case "bathroom": 
						if(isBathroomflooded()== true) {System.out.println("Bad idea");}
						
						else{setRoom("bathroom");}
							break outer;
				
					case "kitchen" :setRoom("kitchen");
						break outer;
				
					default :  System.out.println("incorrect input");
				      System.out.println();
				break outer;}
				
				


				
			case "bathroom":
				Bathroom.description();
				String answer1 = scan.next();
				System.out.println();
				
				switch(answer1) {
				
				case "hands": 
							Bathroom.washHands();
							break outer;
				
				case "mirror": 
							Bathroom.gazeIntoMirror();
							break outer;
				
				case "toilet":
					System.out.println("Number 1[Command: 1] or Number 2[Command: 2]?");
				    int a = scan.nextInt();
							Bathroom.useToilet(a);
							break outer;
					
				case "bedroom": setRoom("bedroom");
							break outer;

				default: 	System.out.println("incorrect input");
							break outer;
				}
				
				
				
				
			
		     	case "kitchen":
		     		Kitchen.description();
		     		String s =scan.next();
				System.out.println();
				
			
				 switch(s) {
					case "fridge":
						Kitchen.openFridge();
						break outer;
					case "eat":
						Kitchen.eatFood();
						break outer;
					case "cook":
						Kitchen.cookFood();
						break outer;	
						
					case "bedroom": 
						setRoom("bedroom");
						break outer;
					case "trash": 
						Kitchen.lookThroughTrash();;
						break outer;	
						}
			break outer;
				
			case "lair":
				Lair.description();				
	
				String answer = scan.next();
					switch(answer) {
					case "approach":
						Lair.approachBadBill();
						break outer;
					case "stairs":
						Player.setRoom("bedroom");
						break outer;
					}
					
			
				

					
					
					
		
			case "outside":

				System.out.println("You're standing at the front door of a studio apartment in Camden, New Jersey.  You try the handle and realize the door is unlocked");
				System.out.println("What do you want to do?");
				System.out.println("Things to do: Enter , Leave");
				    
				  
				    String s1 = scan.next();
				    
				    
				
				if(s1.toLowerCase().strip().equals( "enter")) {
					
				setRoom("bedroom"); break outer;}
				
				else if(s1.toLowerCase().strip().equals( "leave")) {System.out.println("Game Over");
				setDead(true);}
				
				else {System.out.println("Invalid Option");}
					
					break outer;
		
		
				}}
	 
	 
				
	
	
	}}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
		
		
		
	

