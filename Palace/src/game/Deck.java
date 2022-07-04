package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that creates an empty deck of cards for the game Palace.
 * @author Christian Gonzalez
 * @date 05/18/2022
 * @last_modified 07/04/2022
 */
public class Deck {

	protected List<Card> deckOfCards;

	public Deck() {
		deckOfCards = new ArrayList<Card>();
	}

	/**
	 * Get a specified card from the deck.
	 * @param fromHere - grab a card from this deck.
	 * @param i - grab the card from this index.
	 * @return - location of the card in the deck.
	 */
	public Card getCard(Deck fromHere, int i) {
		return fromHere.deckOfCards.get(i);
	}

	/**
	 * Remove a specified card from the deck.
	 * @param fromHere - remove a card from this specified deck.
	 * @param i - location of the card in the deck.
	 */
	public void removeCard(Deck fromHere, int i) {
		fromHere.deckOfCards.remove(i);		
	}

	/**
	 * Add a card to end of the deck.
	 * @param toHere - add thisCard to the deck.
	 * @param thisCard - the card to be added to the end of the deck.
	 */
	public void addCard(Deck toHere, Card thisCard) {
		toHere.deckOfCards.add(thisCard);
	}

	/**
	 * Moves a specified card from one deck to another.
	 * @param fromHere - remove a specified card from this deck
	 * @param toHere - add that card fromHere to this deck
	 * @param location - location of the card to be moved from one deck to the other deck.
	 */
	public void moveCard(Deck fromHere, Deck toHere, int location) {
		Card target = fromHere.getCard(fromHere, location);
		fromHere.removeCard(fromHere, location);
		fromHere.addCard(toHere, target);
	}

	/**
	 * Shuffles the deck of cards.
	 * @param thisDeck - Shuffle the elements inside this deck.
	 */
	public void shuffleDeck(Deck thisDeck) {
		Collections.shuffle(thisDeck.getDeckArrayList(thisDeck));
	}

	/**
	 * Return the size of the deck.
	 * @param thisDeck - a specified deck.
	 * @return - the size of that deck.
	 */
	public int deckSize(Deck thisDeck) {
		return thisDeck.deckOfCards.size();
	}

	/**
	 * Return the List of the deck object.
	 * @param fromThisDeck - return the List of this specified deck object.
	 * @return - returns a List of a deck.
	 */
	public List<Card> getDeckArrayList(Deck fromThisDeck){
		return deckOfCards;
	}

//	/**
//	 * Return the lowest rank int in the deck.
//	 * @param thisDeck - look for the lowest rank in this specified deck.
//	 * @return - returns the lowest ranked card.
//	 */
//	public int getLowestRank(Deck thisDeck) {
//		// Make sure we have a valid card to compare to the rest of the deck.
//		Card verifyValid = thisDeck.getCard(thisDeck, 0);
//		for(int k = 1; k < thisDeck.deckSize(thisDeck); k++) {
//			if(verifyValid.getSpecial() == Specials.None) {
//				break;
//			}
//			else {
//				verifyValid = thisDeck.getCard(thisDeck, k);
//			}
//
//		}		
//
//		// Now compare it to the rest of the deck.
//		for(int i = 1; i < this.deckSize(thisDeck); i++) {
//			Card compareTo = thisDeck.getCard(thisDeck, i);
//			if(verifyValid.getRank().getRankVal() > compareTo.getRank().getRankVal() && compareTo.getSpecial() == Specials.None) {
//				verifyValid = thisDeck.getCard(thisDeck, i);
//			}
//		}
//		int val = verifyValid.getRank().getRankVal();
//		return val;
//	}
//
//	/**
//	 * Return the lowest ranked card object.
//	 * @param thisDeck - from this specified deck.
//	 * @return - the card object with the lowest rank.
//	 */
//	public Card getLowestRankCard(Deck thisDeck) {
//		// Make sure we have a valid card to compare to the rest of the deck.
//		Card verifyValid = thisDeck.getCard(thisDeck, 0);
//		for(int k = 1; k < thisDeck.deckSize(thisDeck); k++) {
//			if(verifyValid.getSpecial() == Specials.None) {
//				break;
//			}
//			else {
//				verifyValid = thisDeck.getCard(thisDeck, k);
//			}
//
//		}		
//
//		// Now compare it to the rest of the deck.
//		for(int i = 1; i < this.deckSize(thisDeck); i++) {
//			Card compareTo = thisDeck.getCard(thisDeck, i);
//			if(verifyValid.getRank().getRankVal() > compareTo.getRank().getRankVal() && compareTo.getSpecial() == Specials.None) {
//				verifyValid = thisDeck.getCard(thisDeck, i);
//			}
//		}
//		return verifyValid;
//	}
	
//	/**
//	 * Finds the exact location of a card inside of a deck.
//	 * @param thisDeck - look inside of this deck.
//	 * @param target - find the index of this card.
//	 * @return - the index of this card inside of the deck.
//	 */
//	public int findCardLocation(Deck thisDeck, Card target) {
//		Card findLocation = target;
//		int location = -1;
//		for(int i = 0; i < thisDeck.deckSize(thisDeck); i++) {
//			if(thisDeck.getCard(thisDeck, i) == findLocation) {
//				location = i;
//				break;
//			}
//		}
//		return location;
//	}

	/**
	 * Prints the cards inside the deck.
	 * @param fromThisDeck - specified deck from which to read from.
	 */
	public void showHand(Deck fromThisDeck) {
		for(int i = 0; i < fromThisDeck.deckSize(fromThisDeck); i++) {
			Card fetchedCard = fromThisDeck.getCard(fromThisDeck, i);
			System.out.println(i + ": " + fetchedCard.toString(fetchedCard));
		}
	}
}