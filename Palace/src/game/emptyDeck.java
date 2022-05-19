package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that creates an empty deck of cards for the game Palace.
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 05/19/2022
 */
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
	public void addCard(emptyDeck toThisDeck, cards thisCard) {
		toThisDeck.deckOfCards.add(thisCard);
	}

	/**
	 * Moves a card from one deck to another
	 * @param fromThisDeck - removes a card from this specified deck
	 * @param toThisDeck - adds a card fromThisDeck to this specified deck
	 */
	public void moveCard(emptyDeck fromThisDeck, emptyDeck toThisDeck) {
		// Debugging code: verifies indices are correct.
		//		System.out.println("The size of fromThisDeck cards is: " + fromThisDeck.deckSize(fromThisDeck) +
		//				"\nThe size of toThisDeck: " + toThisDeck.deckSize(toThisDeck));
		cards targetCard = fromThisDeck.getCard(fromThisDeck, fromThisDeck.deckSize(fromThisDeck) - 1);
		fromThisDeck.removeCard(fromThisDeck, fromThisDeck.deckSize(fromThisDeck) - 1);
		toThisDeck.addCard(toThisDeck, targetCard);

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

		// First test to make sure the deck is empty
		if (testEmptyDeck.deckSize(testEmptyDeck) == 0) {
			System.out.println("This deck is empty");
		}
		else {
			cards fetchedCard = testEmptyDeck.getCard(testEmptyDeck, 0);
			System.out.println("0: " + fetchedCard.toString(fetchedCard));
		}

		deck testDeck = new deck();

		testEmptyDeck.moveCard(testDeck, testEmptyDeck);

		// Second test to make sure the previously empty deck now has one card
		if (testEmptyDeck.deckSize(testEmptyDeck) == 0) {
			System.out.println("This deck is empty");
		}
		else {
			cards fetchedCard = testEmptyDeck.getCard(testEmptyDeck, 0);
			System.out.println("0: " + fetchedCard.toString(fetchedCard));
		}
	}

}