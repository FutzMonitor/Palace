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
		player p_one = new player("Chris");
		player p_two = new player("CPU");

		// Create the main pile which is where the game takes place.
		// Create the main deck where the cards are dealt and drawn from.
		// Shuffle the mainDeck before the game starts
		emptyDeck mainPile = new emptyDeck();
		deck mainDeck = new deck();
		mainDeck.shuffleDeck(mainDeck);







	}

}