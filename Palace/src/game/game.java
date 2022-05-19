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

	public void startGame() {
		// Create two players. For now we'll have myself and a CPU. 
		player p_one = new player("Chris", 0);
		player p_two = new player("CPU", 1);

		// Create the main pile which is where the game takes place.
		// Create the main deck where the cards are dealt and drawn from.
		// Shuffle the mainDeck before the game starts
		emptyDeck mainPile = new emptyDeck();
		deck mainDeck = new deck();
		mainDeck.shuffleDeck(mainDeck);
		
		// Give each player their "tableHand"
		// Mark three of those cards as "invisible"
		p_one.getPlayerTableHand(p_one).moveCard(mainPile, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainPile, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).moveCard(mainPile, p_one.getPlayerTableHand(p_one));
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 0).setVisibility(false);
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 1).setVisibility(false);
		p_one.getPlayerTableHand(p_one).getCard(mainDeck, 2).setVisibility(false);

		
		p_two.getPlayerTableHand(p_two).moveCard(mainPile, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainPile, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).moveCard(mainPile, p_two.getPlayerTableHand(p_two));
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 0).setVisibility(false);
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 1).setVisibility(false);
		p_two.getPlayerTableHand(p_two).getCard(mainDeck, 2).setVisibility(false);

		







	}

}