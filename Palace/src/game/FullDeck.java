package game;

import java.util.ArrayList;

/**
 * Class that creates a full deck of cards for the game Palace
 * This class is a sub-class of Deck class
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 07/04/2022
 */
public class FullDeck extends Deck{

	/**
	 * Constructs a deck (ArrayList of cards) of 52 cards.
	 */
	public FullDeck() {
		deckOfCards = new ArrayList<Card>();

		for (Suites s : Suites.values()) {
			for (Ranks r : Ranks.values()) {
				if(r.getRankVal() == 2) {
					Card c = new Card(r, s, Specials.Bomb);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 4) {
					Card c = new Card(r, s, Specials.Window);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 7) {
					Card c = new Card(r, s, Specials.Humility);
					deckOfCards.add(c);
				}
				else if(r.getRankVal() == 10) {
					Card c = new Card(r, s, Specials.Reset);
					deckOfCards.add(c);
				}
				else {
					Card c = new Card(r, s, Specials.None);
					deckOfCards.add(c);
				}
			}
		}  
	}
}