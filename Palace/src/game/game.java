package game;
/**
 * The main game component of Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/18/2022
 */
public class game {

	// Keeps track of which player makes their turn.
	private int turnCounter;

	public void playerTurn() {

	}

	public static void startGame() {
		// Create two players. For now we'll have myself and a CPU. 
		player p_one = new player("Chris", 0);
		player p_two = new player("CPU", 1);

		// Create the main pile which is where the game takes place.
		// Create the main deck where the cards are dealt and drawn from.
		// Shuffle the mainDeck before the game starts
		emptyDeck mainPile = new emptyDeck();
		deck mainDeck = new deck();
		mainDeck.shuffleDeck(mainDeck);
		
		// Make sure the main deck was populated with 52 cards. 
		System.out.println("The size of this main deck of cards is: " + mainDeck.deckSize(mainDeck));
		
		// Give each player their "tableHand"
		// Mark three of those cards as "invisible"
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 0).setVisibility(false);
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 1).setVisibility(false);
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 2).setVisibility(false);

		
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 0).setVisibility(false);
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 1).setVisibility(false);
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 2).setVisibility(false);

		// Make sure 6 cards have been removed from the main deck
		System.out.println("The size of this main deck of cards is: " + mainDeck.deckSize(mainDeck));
		
		//Add 7 cards to both players hands
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainDeck, p_one.getPlayerHand(p_one));

		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainDeck, p_two.getPlayerHand(p_two));

		// Cards have been dealt. Make sure the size of tableHand, Hand, and Main Deck are correct. 
		System.out.println("The size of this main deck of cards is: " + mainDeck.deckSize(mainDeck)
				+ "\n" + p_one.getName() + "'s hand has: " + p_one.getPSize(p_one.getPlayerHand(p_one))
				+ " || and their table hand has: " + p_one.getPSize(p_one.getPlayerTableHand(p_one))
				+ "\n" + p_two.getName() + "'s hand has: " + p_two.getPSize(p_two.getPlayerHand(p_two)) 
				+ " || and their table hand has : " + p_two.getPSize(p_two.getPlayerTableHand(p_two)));




	}
	
	public static void main(String[] args) {
		startGame();
		
	}

}