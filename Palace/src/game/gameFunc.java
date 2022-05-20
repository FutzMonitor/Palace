package game;

import java.util.Scanner;

/**
 * Class that houses functions for the game Palace
 * Keeps the game.java class relatively clean and organized.
 * @author Christian Gonzalez
 * @date 05/19/2022
 * @last_modified 05/19/2022
 */
public class gameFunc {

	private final static int tableCardLimit = 4;


	/**
	 * Deals three facedown cards to each player's table hand.
	 * Deals seven cards to each player's hand.
	 * @param one - the first player
	 * @param two - the second player
	 * @param fromThisDeck - cards are dealt from this specified deck.
	 */
	public static void dealCards(player one, player two, emptyDeck fromThisDeck) {
		// Give each player their "tableHand".
		// Mark three of those cards as "invisible".

		for(int i = 0; i < 3; i++) {
			fromThisDeck.getCard(fromThisDeck, fromThisDeck.deckSize(fromThisDeck) - 1).setVisibility(false);
			one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerTableHand(one));
			//			System.out.println("Cards inside the table hand: \n");
			//			one.showPlayerHand(one.getPlayerTableHand(one));
			//			System.out.println("\n");
			//one.getPlayerTableHand(one).getCard(fromThisDeck, i).setVisibility(false);
		}

		for(int j = 0; j < 3; j++) {
			fromThisDeck.getCard(fromThisDeck, fromThisDeck.deckSize(fromThisDeck) - 1).setVisibility(false);
			two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerTableHand(two));
			//two.getPlayerTableHand(two).getCard(fromThisDeck, j).setVisibility(false);
		}

		// Give each player their seven cards for their hand.
		for(int k = 0; k < 14; k++) {
			if(k % 2 == 0) {
				one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerHand(one));
			}
			else {
				two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerHand(two));
			}
		}
		// For debugging purposes.
		// Cards have been dealt. Make sure the size of tableHand, Hand, and Main Deck are correct. 
		//		System.out.println("The size of this main deck of cards is: " + fromThisDeck.deckSize(fromThisDeck)
		//		+ "\n" + one.getName() + "'s hand has: " + one.getPSize(one.getPlayerHand(one))
		//		+ " || and their table hand has: " + one.getPSize(one.getPlayerTableHand(one))
		//		+ "\n" + two.getName() + "'s hand has: " + two.getPSize(two.getPlayerHand(two)) 
		//		+ " || and their table hand has : " + two.getPSize(two.getPlayerTableHand(two)));
	}

	public static boolean printRules(String resp) {
		if(resp.toLowerCase().contains("y")) {
			System.out.println("\nAlright, listen closely: " +
					"From your hand you place down cards that equal or are greater than the value " +
					"currently on the pile. \nAfter playing your card, you draw another card from the deck until that " +
					"deck is empty. Then you can use the card on the table. " +
					"\nIf you cannot place down a card you have two options:" +
					"\n(1.) You can play a magic card. The magic cards include:" + 
					"\n\tBOMB - any card with rank 2 can discard the whole pile. You can place another card." + 
					"\n\tWINDOW - any card with rank 4 forces the opposing player to beat the card under 4." +
					"\n\tHumility - any card with rank 7 forces the opposing player to play a card 7 or below." +
					"\n\tReset - any card with rank 10 resets the rank of the pile by whatever card the player plays next" +
					"\n\tOf course you can also play another magic card on top of another." +
					"\n(2.) If you don't have a magic card or a card that is equal or greater than the one currently in the" +
					" pile, then you have no choice \n\tbut to pick up the whole pile. You can reset the pile's rank to" +
					" whatever you like." +
					"\n\nWell, those are the rules. Let's get started!");
			return true;
		}
		else if(resp.toLowerCase().contains("n")) {
			System.out.println("\nAlready know the rules? Perfect, let's get started!");
			return true;
		}
		//Invalid response
		System.out.println("Mmm, not a valid response, but we will go ahead and start anyway." );

		return false; 
	}

	/**
	 * Move a specified card from the player's hand to his table cards.
	 * @param thisPlayer - specifies the player.
	 * @param cardLocation - specifies which card is being moved.
	 */
	public static void placeDownCards(player thisPlayer, int cardLocation, int limit){
		thisPlayer.getPlayerHand(thisPlayer).moveCardWithLocation(thisPlayer.getPlayerHand(thisPlayer), thisPlayer.getPlayerTableHand(thisPlayer), cardLocation);

		System.out.println("These are the your cards on the table " + thisPlayer.getName());
		thisPlayer.showPlayerHand(thisPlayer.getPlayerTableHand(thisPlayer));
		System.out.println("\nThese are the cards in your hand " + thisPlayer.getName());
		thisPlayer.showPlayerHand(thisPlayer.getPlayerHand(thisPlayer));

		if(limit < tableCardLimit) {
			System.out.println("\nPlease choose card number " +  limit + " to place down: \n");
			Scanner putDownResp = new Scanner(System.in); 
			System.out.println("Please enter a number [0-6]: ");
			int faceupCard = putDownResp.nextInt();
			gameFunc.placeDownCards(thisPlayer, faceupCard, limit + 1);
		}
		

	}


}
