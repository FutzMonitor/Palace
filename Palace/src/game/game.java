package game;

import java.util.Scanner;

/**
 * The main game component of Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 06/01/2022
 */
public class game {

	// Keeps track of which player makes their turn.
	private static int turnCounter;
	private static boolean noWinner = true;
	private static Deck mainPile;

	/**
	 * Get the turn counter.
	 * @return - the turn counter.
	 */
	public static int getTurnCounter() {
		return turnCounter;
	}

	public static Deck getMainPile() {
		return mainPile;
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
		Player p_one = new Player("Chris", 0);
		CPU p_two = new CPU("CPU", 1);

		// Create the main pile which is where the game takes place.
		// Create the main deck where the cards are dealt and drawn from.
		// Shuffle the mainDeck before the game starts
		mainPile = new Deck();
		Deck discrdedPile = new Deck();
		FullDeck mainDeck = new FullDeck();
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
		if(getTurnCounter() == 0) {
			System.out.println("\nYou'll be the one to start " + p_one.getName() + "\n");
		}
		else {
			System.out.println("\nYou'll be the one to start " + p_two.getName() + "\n");
		}


		// The main game: placing down cards until there's a winner.
		while(noWinner) {
			if(getTurnCounter() == 0) {
				if(p_one.getPlayerHand(p_one).deckSize(p_one.getPlayerHand(p_one)) < 4) {
					p_one.getPlayerHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));	
					System.out.println("\nThese are the cards in your hand: " + p_one.getName() + "\n");
					p_one.showPlayerHand(p_one.getPlayerTableHand(p_one));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
				else if(p_one.getPlayerHand(p_one).deckSize(p_one.getPlayerHand(p_one)) >= 4) {
					p_one.showPlayerHand(p_one.getPlayerTableHand(p_one));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
				else {
					System.out.println("\nThese are the cards in your hand: " + p_one.getName() + "\n");
					p_one.showPlayerHand(p_one.getPlayerTableHand(p_one));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
			}
			else {
				if(p_two.getPlayerHand(p_two).deckSize(p_two.getPlayerHand(p_two)) < 4) {
					p_two.getPlayerHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
					p_two.showPlayerHand(p_two.getPlayerTableHand(p_two));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
				else if(p_two.getPlayerHand(p_two).deckSize(p_two.getPlayerHand(p_two)) >= 4) {
					p_two.showPlayerHand(p_two.getPlayerTableHand(p_two));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
				else {
					p_two.showPlayerHand(p_two.getPlayerTableHand(p_two));
					System.out.println("\nYou have to beat: " + mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1).toString(mainPile.getCard(mainPile, mainPile.deckSize(mainPile) - 1)));
				}
			}
		}


	}

	public static void main(String[] args) {
		startGame();
	}
}