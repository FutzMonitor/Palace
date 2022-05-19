package game;

/**
 * Class that houses functions for the game Palace
 * Keeps the game.java class relatively clean and organized.
 * @author Christian Gonzalez
 * @date 05/19/2022
 * @last_modified 05/19/2022
 */
public class gameFunc {


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
			one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerTableHand(one));
			one.getPlayerTableHand(one).getCard(fromThisDeck, i).setVisibility(false);
		}

		for(int j = 0; j < 3; j++) {
			two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerTableHand(two));
			two.getPlayerTableHand(two).getCard(fromThisDeck, j).setVisibility(false);
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

		//		one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerTableHand(one));
		//		one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerTableHand(one));
		//		one.getPlayerTableHand(one).moveCard(fromThisDeck, one.getPlayerTableHand(one));
		//		one.getPlayerTableHand(one).getCard(fromThisDeck, 0).setVisibility(false);
		//		one.getPlayerTableHand(one).getCard(fromThisDeck, 1).setVisibility(false);
		//		one.getPlayerTableHand(one).getCard(fromThisDeck, 2).setVisibility(false);


		//		two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerTableHand(two));
		//		two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerTableHand(two));
		//		two.getPlayerTableHand(two).moveCard(fromThisDeck, two.getPlayerTableHand(two));
		//		two.getPlayerTableHand(two).getCard(fromThisDeck, 0).setVisibility(false);
		//		two.getPlayerTableHand(two).getCard(fromThisDeck, 1).setVisibility(false);
		//		two.getPlayerTableHand(two).getCard(fromThisDeck, 2).setVisibility(false);


		//Add 7 cards to both players hands
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		//
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		//		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
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










}
