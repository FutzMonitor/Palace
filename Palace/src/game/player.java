package game;

/**
 * Class that creates a player for the game Palace
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/18/2022
 */
public class player {
	
	private String pName;
	
	/**
	 * Constructs two empty decks for the player.
	 */
	public player(String initPName) {
		pName = initPName;
		emptyDeck playerHand = new emptyDeck();
		emptyDeck tableHand = new emptyDeck();
	}
}