package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class emptyDeck {

	protected List<cards> deckOfCards;

	public emptyDeck() {
		deckOfCards = new ArrayList<cards>();
	}
	
	/**
	 * Get a card from the deck of cards.
	 * @param fromThisDeck - grab a card from this specified deck.
	 * @param i - grab the card from this index.
	 * @return - a card from a specific deck from that index.
	 */
	public cards getCard(emptyDeck fromThisDeck, int i) {
		return fromThisDeck.deckOfCards.get(i);
	}

	/**
	 * Remove a card from the deck of cards.
	 * @param fromThisDeck - remove a card from this specified deck.
	 * @param i - remove a card from this specified location in the deck
	 */
	public void removeCard(emptyDeck fromThisDeck, int i) {
		fromThisDeck.deckOfCards.remove(i);		
	}

	/**
	 * Add a card to end of the deck of cards.
	 * @param fromThisDeck - add a card to the deck
	 * @param thisCard - add this card object to the deck
	 */
	public void addCard(emptyDeck fromThisDeck, cards thisCard) {
		fromThisDeck.deckOfCards.add(thisCard);
	}

	/**
	 * Shuffles a deck of cards.
	 * @param fromThisDeck - Shuffle the elements inside this specified deck.
	 */
	public void shuffleDeck(emptyDeck fromThisDeck) {
		Collections.shuffle(fromThisDeck.getDeckArrayList(fromThisDeck));
	}

	/**
	 * Return the size of the deck.
	 * @param fromThisDeck - a specified deck.
	 * @return - the size of that deck.
	 */
	public int deckSize(emptyDeck fromThisDeck) {
		return fromThisDeck.deckOfCards.size();
	}

	/**
	 * Return the List of the deck object.
	 * @param fromThisDeck - return the List of this specified deck object.
	 * @return - returns a List of a deck.
	 */
	public List<cards> getDeckArrayList(emptyDeck fromThisDeck){
		return deckOfCards;
	}
	
	public static void main(String[] args) {
		emptyDeck testEmptyDeck = new emptyDeck();
		
		if (testEmptyDeck.deckSize(testEmptyDeck) == 0) {
			System.out.println("This deck is empty");
		}
		else {
			cards fetchedCard = testEmptyDeck.getCard(testEmptyDeck, 0);
			System.out.println("0: " + fetchedCard.toString(fetchedCard));
		}
	}

}
