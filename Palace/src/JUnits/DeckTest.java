package JUnits;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import game.Card;
import game.Ranks;
import game.Specials;
import game.Suites;
import game.Deck;
import game.FullDeck;

/**
 * JUnit test meant to test the functionality of the Deck class.
 * This JUnit will also make use of the FullDeck class.
 * @author Christian Gonzalez
 * @date 06/17/2022
 * @last_modified 07/04/2022
 */
public class DeckTest {

	// Used throughout the Junit
	Deck testDeck;
	FullDeck testFullDeck;
	List<Card> testDeckList;
	List<Card> testFullDeckList;
	
	/**
	 * Test the constructor
	 */
	@Test
	public void testDeckConstructor() {
		testDeck = new Deck();
		assertEquals(testDeck.deckSize(testDeck), 0);
		testDeckList = testDeck.getDeckArrayList(testDeck);
		
		testFullDeck = new FullDeck();
		assertEquals(testFullDeck.deckSize(testFullDeck), 52);
		testFullDeckList = testFullDeck.getDeckArrayList(testFullDeck);
		//testFullDeck.showHand(testFullDeck);
		
	}
	
	/**
	 *  Runs the getCard() method inside of the Deck class.
	 *  Tests to see if a card is returned.
	 */
	@Test
	public void testGetCard() { 
		testFullDeck = new FullDeck();
		Card compare = new Card(Ranks.Ace, Suites.Clubs, Specials.None);
		Card ret = testFullDeck.getCard(testFullDeck, 0);
		assertEquals(compare.getRank(), ret.getRank());
		assertEquals(compare.getSuite(), ret.getSuite());
		assertEquals(compare.getSpecial(), ret.getSpecial());
	}
	
	/**
	 *  Runs the removeCard() method inside of the Deck class.
	 *  Tests to see if a card is removed from the deck.
	 */
	@Test
	public void testRemoveCard() { 
		testDeck = new Deck();
		Card compare = new Card(Ranks.Ace, Suites.Clubs, Specials.None);
		testDeck.addCard(testDeck, compare);
		assertEquals(testDeck.deckSize(testDeck), 1);
		testDeck.removeCard(testDeck, 0);
		assertEquals(testDeck.deckSize(testDeck), 0);
	}
	
	/**
	 *  Runs the addCard() method inside of the Deck class.
	 *  Tests to see if a card is added to the deck.
	 */
	@Test
	public void testAddCard() { 
		testDeck = new Deck();
		assertEquals(testDeck.deckSize(testDeck), 0);
		Card compare = new Card(Ranks.Ace, Suites.Clubs, Specials.None);
		testDeck.addCard(testDeck, compare);
		assertEquals(testDeck.deckSize(testDeck), 1);

	}
	
	/**
	 *  Runs the moveCard() method inside of the Deck class.
	 *  Tests to see if a card is moved from one deck to another.
	 */
	@Test
	public void testMoveCard() { 
		testDeck = new Deck();
		Deck moveHere = new Deck();
		assertEquals(testDeck.deckSize(testDeck), 0);
		assertEquals(moveHere.deckSize(testDeck), 0);
		
		Card compare = new Card(Ranks.Ace, Suites.Clubs, Specials.None);
		testDeck.addCard(testDeck, compare);
		
		assertEquals(testDeck.deckSize(testDeck), 1);
		assertEquals(moveHere.deckSize(moveHere), 0);
		
		testDeck.moveCard(testDeck, moveHere, 0);
		
		assertEquals(testDeck.deckSize(testDeck), 0);
		assertEquals(moveHere.deckSize(moveHere), 1);

	}
	
	/**
	 *  Runs the shuffleDeck() method inside of the Deck class.
	 *  Tests to see if a deck of cards is shuffled.
	 *  Note: this test can fail on the off chance that the first card
	 *  after shuffling happens to match the card of comparison (compare).
	 */
	@Test
	public void testShuffleDeck() { 
		testFullDeck = new FullDeck();
		Card compare = new Card(Ranks.Ace, Suites.Clubs, Specials.None);
		Card ret = testFullDeck.getCard(testFullDeck, 0);
		assertEquals(compare.getRank(), ret.getRank());
		assertEquals(compare.getSuite(), ret.getSuite());
		assertEquals(compare.getSpecial(), ret.getSpecial());
		
		testFullDeck.shuffleDeck(testFullDeck);
		ret = testFullDeck.getCard(testFullDeck, 0);
		assertFalse(compare.getRank(), ret.getRank(), null, null, null, null);
		assertFalse(null, null, compare.getSuite(), ret.getSuite(), null, null);
		assertFalse(null, null, null, null, compare.getSpecial(), ret.getSpecial());


	}
	
	/**
	 *  Runs the deckSize() method inside of the Deck class.
	 *  Tests to see if the deck has the expect size.
	 */
	@Test
	public void testDeckSize() { 
		testDeck = new Deck();
		testFullDeck = new FullDeck();
		assertEquals(testDeck.deckSize(testDeck), 0);
		assertEquals(testFullDeck.deckSize(testFullDeck), 52);
	}
	
	/**
	 *  Runs the getDeckArrayList() method inside of the Deck class.
	 *  Tests to see if the deck's array list is returned.
	 */
	@Test
	public void testDeckArrayList() { 
		testDeck = new Deck();
		testFullDeck = new FullDeck();

		testDeckList = testDeck.getDeckArrayList(testDeck);
		testFullDeckList = testFullDeck.getDeckArrayList(testFullDeck);
		System.out.println("testDeckList: " + testDeckList + 
				"\ntestFullDeckList: " + testFullDeckList);
	}
	
	/**
	 *  Runs the showHand() method inside of the Deck class.
	 *  Tests to see if the deck's contents are printed in the console.
	 */
	@Test
	public void testShowHand() { 
		testDeck = new Deck();
		testFullDeck = new FullDeck();
		
		
		System.out.println("This is the showHand() test.\nThe conetents of the testDeck: ");
		testDeck.showHand(testDeck);
		System.out.println("The contents of the testFullDeck: ");
		testFullDeck.showHand(testFullDeck);

	}

	/**
	 * An assertion method for comparing Ransk, Suites, and Specials
	 * @param rank - the first rank to be compared.
	 * @param rank2 - rank is compared against rank2.
	 * @param suite - the first suite to be compared.
	 * @param suite2 - suite is compared against suite2.
	 * @param special - the first special to be compared.
	 * @param special2 - special is compared against special2
	 * @return - the results of these comparisons. 
	 */
	private Boolean assertFalse(Ranks rank, Ranks rank2, Suites suite, Suites suite2, Specials special, Specials special2) {
		if(rank == rank2 || suite == suite2 || special == special2) {
			return true;
		}
		else {
			return false;
		}
	}

}
