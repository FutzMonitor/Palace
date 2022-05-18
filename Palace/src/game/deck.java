package game;

import java.util.ArrayList;

/**
 * Class that creates a deck of cards for the game Palace
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
					cards c = new cards(r, s, Special.Bomb);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 4) {
					cards c = new cards(r, s, Special.Window);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 7) {
					cards c = new cards(r, s, Special.Humility);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 10) {
					cards c = new cards(r, s, Special.Reset);
					deckOfCards.add(c);
				}
				else {
					cards c = new cards(r, s, Special.None);
					deckOfCards.add(c);
				}
			}
		}  
	}

	public static void main(String[] args) {
		deck testDeck = new deck();
		System.out.println("The size of this deck of cards is: " + testDeck.deckSize(testDeck));
		for(int i = 0; i < testDeck.deckSize(testDeck); i++) {
			cards fetchedCard = testDeck.getCard(testDeck, i);
			System.out.println(i + ": " + fetchedCard.toString(fetchedCard));
		}

		System.out.println("\nShuffled cards: \n");
		testDeck.shuffleDeck(testDeck);

		for(int j = 0; j < testDeck.deckSize(testDeck); j++) {
			cards fetchedCard = testDeck.getCard(testDeck, j);
			System.out.println(j + ": " + fetchedCard.toString(fetchedCard));
		}

	}
}
