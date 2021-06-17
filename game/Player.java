package game;
import java.util.Scanner;



public class Player {
	
	
private static boolean cleanhands = false;

private static boolean wellfed = false;

private static boolean wellrested = false;

private static boolean poisoned= false;

private static boolean dead = false;

private static boolean haveMeat = false;

private static boolean meatCooked = false;

private static boolean fridgeempty = false;

private static boolean bathroomflooded = false;

public static String input() {
    Scanner scan = new Scanner(System.in);
    String s =scan.next();
    scan.close();

            return s;
	}


public static int inputInt() {
    Scanner scan = new Scanner(System.in);
	while (true) {    try {
        int i =scan.nextInt();
        scan.close();

            return i;
        }
        catch (java.util.NoSuchElementException  e) {
        	
            scan.nextLine();
            continue;

          
        }

    }
	
}





public static boolean isBathroomflooded() {
	return bathroomflooded;
}

public static void setBathroomflooded(boolean bathroomflooded) {
	Player.bathroomflooded = bathroomflooded;
}

private static String currentroom = "outside";





public static String getCurrentRoom() {
	return currentroom;
}

public static void setRoom(String room) {
	Player.currentroom = room;
}

public static boolean isFridgeempty() {
	return fridgeempty;
}

public static void setFridgeempty(boolean fridgeempty) {
	Player.fridgeempty = fridgeempty;
}

public static boolean isMeatCooked() {
	return meatCooked;
}

public static void setMeatCooked(boolean meatCooked) {
	Player.meatCooked = meatCooked;
}

public static boolean isHaveMeat() {
	return haveMeat;
}

public static void setHaveMeat(boolean haveMeat) {
	Player.haveMeat = haveMeat;
}

public static boolean getSawPaper() {
	return sawPaper;
}

public static void setsawPaper(boolean sawPaper) {
	Player.sawPaper = sawPaper;
}

public static void setSawPaper(boolean sawPaper) {
	Player.sawPaper = sawPaper;
}

private static boolean sawPaper = false;

private static boolean sawMap = false;


public static boolean isSawMap() {
	return sawMap;
}

public static void setSawMap(boolean sawMap) {
	Player.sawMap = sawMap;
}

public static boolean isWellfed() {
	return wellfed;
}

public static void setWellfed(boolean wellfed) {
	Player.wellfed = wellfed;
}

public static boolean isWellrested() {
	return wellrested;
}

public static  void setWellrested(boolean wellrested) {
	Player.wellrested = wellrested;
}

public static boolean isPoisoned() {
	return poisoned;
}

public static void setPoisoned(boolean poisoned) {
	Player.poisoned = poisoned;
}

public static boolean isDead() {
	return dead;
}

public static void setDead(boolean dead) {
	Player.dead = dead;
}





public static boolean hasCleanhands() {
	return cleanhands;
}

public static void setCleanhands(boolean cleanhands) {
	Player.cleanhands = cleanhands;
}


}
