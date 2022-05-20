package game;

import java.util.ArrayList;

/**
 * Class that creates a deck of cards for the game Palace
 * This class is a sub-class of emptyDeck.java
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/18/2022
 */
public class deck extends emptyDeck{

	// Currently using ArrayList found in emptyDeck class
	//private List<cards> deckOfCards;


	/**
	 * Constructs a deck (ArrayList of cards) of 52 cards.
	 */
	public deck() {
		deckOfCards = new ArrayList<cards>();

		for (Suites s : Suites.values()) {
			for (Ranks r : Ranks.values()) {
				if(r.getRankVal() == 2) {
					cards c = new cards(r, s, Specials.Bomb);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 4) {
					cards c = new cards(r, s, Specials.Window);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 7) {
					cards c = new cards(r, s, Specials.Humility);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 10) {
					cards c = new cards(r, s, Specials.Reset);
					deckOfCards.add(c);
				}
				else {
					cards c = new cards(r, s, Specials.None);
					deckOfCards.add(c);
				}
			}
		}  
	}

	public static void main(String[] args) {

		// First test to make sure that a full deck of 52 correct cards are populating the ArrayList that is the deck.
		deck testDeck = new deck();
		System.out.println("The size of this deck of cards is: " + testDeck.deckSize(testDeck));
		testDeck.showHand(testDeck);

		// Second test makes sure that the cards are shuffled.
		System.out.println("\nShuffled cards: \n");
		testDeck.shuffleDeck(testDeck);

		testDeck.showHand(testDeck);

	}
}