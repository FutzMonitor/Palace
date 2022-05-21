package game;

import java.util.Scanner;

/**
 * The main game component of Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/2020/2022
 */
public class game {

	// Keeps track of which player makes their turn.
	private static int turnCounter;

	/*
	 * Generate a random turnCounter to dictate who goes first.
	 */
	public static void generateBeginning() {
		turnCounter = (Math.random() <= 0.5) ? 0 : 1;
	}

	public static int getTurnCounter() {
		return turnCounter;
	}

	public static void startGame() {
		// Create two players. For now we'll have myself and a CPU. 
		player p_one = new player("Chris", 0);
		player p_two = new player("CPU", 1);

		// Create the main pile which is where the game takes place.
		// Create the main deck where the cards are dealt and drawn from.
		// Shuffle the mainDeck before the game starts
		emptyDeck mainPile = new emptyDeck();
		emptyDeck discrdedPile = new emptyDeck();
		deck mainDeck = new deck();
		mainDeck.shuffleDeck(mainDeck);

		// Make sure the main deck was populated with 52 cards. 
		//System.out.println("The size of this main deck of cards is: " + mainDeck.deckSize(mainDeck));

		gameFunc.dealCards(p_one, p_two, mainDeck);

		//		System.out.println("Here's Chris's table hand: \n");
		//		p_one.showPlayerHand(p_one.getPlayerTableHand(p_one));
		//		System.out.println("\nHere's Chris's hand: \n");
		//		p_one.showPlayerHand(p_one.getPlayerHand(p_one));

		System.out.println("Welcome to Palace!\nWould you like an explanation on the rules of the game?");
		Scanner rulesPrompt = new Scanner(System.in); 
		System.out.println("Please enter [y/n]: ");
		String rulesResp = rulesPrompt.nextLine();
		gameFunc.printRules(rulesResp);

		// Decides who goes first
		// Make sure this is randomized
		generateBeginning();
		//System.out.println(getturnCounter());

		// Now, let's ask the user which cards they want to put on the table faceup.
		if(p_one.getTurnid() == getTurnCounter()) {
			System.out.println("\nPlease look at your hand " + p_one.getName());
			p_one.showPlayerHand(p_one.getPlayerHand(p_one));
			System.out.println("\nPlease choose card number 1 to place down: \n");
			Scanner putDownResp = new Scanner(System.in); 
			System.out.println("Please enter a number [0-6]: ");
			int faceupCard = putDownResp.nextInt();
			gameFunc.placeDownCards(p_one, faceupCard, 2);
		}
		else {
			System.out.println("\nPlease look at your hand " + p_two.getName());
			p_two.showPlayerHand(p_two.getPlayerHand(p_two));
		}


	}

	public static void main(String[] args) {
		startGame();
	}
}