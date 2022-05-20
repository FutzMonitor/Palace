package game;

/**
 * Class that creates a player for the game Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/18/2022
 */
public class player {

	private String pName;
	private int turnId;
	private emptyDeck hand;
	private emptyDeck tableHand;


	/**
	 * Constructs two empty decks for the player.
	 */
	public player(String initPName, int initTurnid) {
		pName = initPName;
		turnId = initTurnid;
		hand = new emptyDeck();
		tableHand = new emptyDeck();
	}

	/**
	 * Set a new name for the player.
	 * @param newName - the new name to be set.
	 */
	public void setName(String newName) {
		pName = newName;
	}

	/**
	 * Set a new turn id for the player.
	 * @param newId - the new id for the player's turn id.
	 */
	public void setNewTurnId(int newId) {
		turnId = newId;
	}

	/**
	 * Return the name of the player.
	 * @return - the name of the player.
	 */
	public String getName() {
		return pName;
	}

	/**
	 * Return the turn id of the player.
	 * @return - the turn id of the player
	 */
	public int getTurnid() {
		return turnId;
	}

	/**
	 * Return the player's hand.
	 * @param thisPlayer - specifies the player we want to look at.
	 * @return - return a specified player's hand.
	 */
	public emptyDeck getPlayerHand(player thisPlayer) {
		return hand;
	}

	/**
	 * Return the player's table hand.
	 * @param thisPlayer - specifies the player we want to look at.
	 * @return - return a specified player's table hand.
	 */
	public emptyDeck getPlayerTableHand(player thisPlayer) {
		return tableHand;
	}

	/**
	 * Return the size of the player's deck
	 * @param thisDeck - specified deck, grab its size.
	 * @return - the size of the specified deck.
	 */
	public int getPSize(emptyDeck thisDeck) {
		return thisDeck.deckSize(thisDeck);
	}
	
	/**
	 * Show the player's hand by calling the emptyDeck's showHand() function.
	 * @param fromThisDeck - show cards of this specified deck.
	 */
	public void showPlayerHand(emptyDeck fromThisDeck) {
		fromThisDeck.showHand(fromThisDeck);
	}
}