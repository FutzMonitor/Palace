package game;

import java.util.Scanner;

/**
 * The main game component of Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/25/2022
 */
public class game {

	// Keeps track of which player makes their turn.
	private static int turnCounter;
	private static boolean noWinner = true;

	/**
	 * Get the turn counter.
	 * @return - the turn counter.
	 */
	public static int getTurnCounter() {
		return turnCounter;
	}
	
	/**
	 * Sets a new turn counter for the game.
	 * @param newCounter - the new number value for the counter.
	 */
	public static void setTurnCounter(int newCounter) {
		turnCounter = newCounter;
	}

	public static void startGame() {
		// Create two players. For now we'll have myself and a CPU. 
		player p_one = new player("Chris", 0);
		cpu p_two = new cpu("CPU", 1);

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
		//rulesPrompt.close();

		// Allow both players to put their cards facedown. 
		p_two.placeTableCards(p_two, p_two.getPlayerHand(p_two));

		// Now, let's ask the user which cards they want to put on the table faceup.
		System.out.println("\nPlease look at your hand " + p_one.getName());
		p_one.showPlayerHand(p_one.getPlayerHand(p_one));
		System.out.println("\nPlease choose card number 1 to place down: \n");
		Scanner putDownResp = new Scanner(System.in); 
		System.out.println("Please enter a number [0-6]: ");
		int faceupCard = putDownResp.nextInt();
		gameFunc.placeDownCards(p_one, faceupCard, 2);
		
		System.out.println("\nThese are the cards placed on the table by the CPU: \n");
		p_two.showPlayerHand(p_two.getPlayerTableHand(p_two));
		
		System.out.println("\nThese are the cards in the CPU's hand: \n");
		p_two.showPlayerHand(p_two.getPlayerHand(p_two));

		gameFunc.determineStartingTurn(p_one, p_two);
		System.out.println("The player with this turn id: " + getTurnCounter() + " is going first.");
		
		// The main game: placing down cards until there's a winner.
		while(noWinner) {
			if(getTurnCounter() == 0) {
				
			}
			else {
				
			}
		}


	}

	public static void main(String[] args) {
		startGame();
	}
}