package game_package;

import java.util.Scanner;
import java.util.Random;

public class BMO {
	
	// things I need to understand how this was done:
	
	// public void
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	Random rangen = new Random();
	
	int playerHP;
	int playerCharisma;
	String playerName;
	String playerWeapon;
	
	int choice;
	
	int monsterHP;
	
	boolean bakedGood = false;
	boolean cash = false;
	boolean mushroom = false;
	boolean coins = false;
	boolean finger = false;
		
	public static void main(String[] args) {
		
		//i think he has written his own object/function 'Game'
		BMO belfast;
		belfast = new BMO();	
		
		//redirects you to townGate immediately after finishing playerSetUp
		belfast.playerSetUp();
		belfast.alleyWake();
		 	
		
	}
	
	//
	public void playerSetUp(){
		
		
		playerHP = 10;
		playerCharisma = -10;
		monsterHP = 1;

		playerWeapon = "Spoon";

		System.out.println("Your HP: "+ playerHP);
		System.out.println("Your Weapon: "+ playerWeapon);
		
		System.out.println("Please enter your name:");
		
		playerName = myScanner.nextLine();
		
		System.out.println("Hello " + playerName + ", let's start the game!");	
		
		
	}	
	
	//
	public void alleyWake(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at the gate of the town.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1: ");
		System.out.println("2: ");
		System.out.println("3: ");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();
		
		if(choice==1){
			if(bakedGood==true){
				alleyWin();
			}
			else{
				System.out.println("Guard: Hello there, stranger. So your name is " + playerName + "? \nSorry but we cannot let stranger enter our town.");
				enterScanner.nextLine();
				alleyMid();
			}
			
		}
		else if(choice==2){
			playerHP = playerHP-1;
			System.out.println("Guard: Hey don't be stupid.\n\nThe guard hit you so hard and you gave up.\n(You receive 1 damage)\n");
			System.out.println("Your HP: " + playerHP);
			enterScanner.nextLine();
			alleyMid();
		}
		else if(choice==3){
			map();
		}	
		else{
			alleyMid();
		}
	}
	
	public void alleyMid(){
		
	}
	
	public void alleyRespawn(){
		
	}
	
	public void alleyWin(){
		
	}
	
	public void map(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at a crossroad. If you go south, you will go back to the town.\n\n");
		System.out.println("1: Go ");
		System.out.println("2: Go east");
		System.out.println("3: Go south");
		System.out.println("4: Go west");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		switch (choice) {
		case 1: alleyMid();
		case 2: fancyRestaurant();
		case 3: bank();
		case 4: forest ();
		case 5: footpath();
		}
	}
	
	
	public void fancyRestaurant(){
		
	}
	public void forest(){
		
	}
	public void mushroomGarden(){
		
	}
	public void mushroomGardenFight(){
		
	}
	public void bank(){
		
	}
	public void footpath(){
		
	}
	public void gasStation(){
		
	}
	public void gasStationBathroom(){
		
	}
	
	public void bakery(){
		
	}
	
	
	
}
