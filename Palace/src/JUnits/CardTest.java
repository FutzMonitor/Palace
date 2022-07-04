package JUnits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import game.Card;
import game.Ranks;
import game.Specials;
import game.Suites;

/**
 * JUnit test meant to test the functionality of the Card class
 * @author Christian Gonzalez
 * @date 06/16/2022
 * @last_modified 06/17/2022
 */
public class CardTest {

	// Used throughout the Junit. 
	Card test;

	/**
	 *  Runs the constructor 
	 *  Tests against the getter and setter methods
	 */
	@Test
	public void testCardConstructor() {
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getRank(), Ranks.Two);
		assertEquals(test.getSuite(), Suites.Spades);
		assertEquals(test.getSpecial(), Specials.Bomb);
		assertEquals(test.getVisibility(), true);

		System.out.println("Before set tests:\n");
		System.out.println("Card's rank: " + test.getRank() + ", value of " + test.getRank().getRankVal()
		+ "\nCard's suite: " + test.getSuite() + 
		"\nCard's Special: " + test.getSpecial()
		+ "\nCard's Visibility: " + test.getVisibility());
		
		test.setRank(Ranks.Ace);
		test.setSuite(Suites.Hearts);
		test.setSpecial(Specials.None);
		test.setVisibility(false);

		assertEquals(test.getRank(), Ranks.Ace);
		assertEquals(test.getSuite(), Suites.Hearts);
		assertEquals(test.getSpecial(), Specials.None);
		assertEquals(test.getVisibility(), false);

		System.out.println("\nAfter set tests:\n");
		System.out.println("Card's rank: " + test.getRank() + ", value of " + test.getRank().getRankVal()
		+ "\nCard's suite: " + test.getSuite() + 
		"\nCard's Special: " + test.getSpecial()
		+ "\nCard's Visibility: " + test.getVisibility());
	}

	/**
	 *  Runs the getRank() 
	 *  Tests to see if the rank is changed. 
	 */
	@Test
	public void testGetRank() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getRank(), Ranks.Two);

	}

	/**
	 *  Runs the getRank() 
	 *  Tests to see if the rank is changed. 
	 */
	@Test
	public void testGetSuite() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		test.setSuite(Suites.Hearts);

	}

	/**
	 *  Runs the getRank() 
	 *  Tests to see if the rank is changed. 
	 */
	@Test
	public void testGetSpecial() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		test.setSpecial(Specials.None);

	}

	/**
	 *  Runs the getRank() 
	 *  Tests to see if the rank is changed. 
	 */
	@Test
	public void testGetVisibility() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getVisibility(), true);

	}

	/**
	 *  Runs the setRank(Ranks newRank) 
	 *  Tests to see if the Rank is changed. 
	 */
	@Test
	public void testSetRank() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getRank(), Ranks.Two);
		test.setRank(Ranks.Ace);
		assertEquals(test.getRank(), Ranks.Ace);

	}

	/**
	 *  Runs the setSuite(Suites newSuite) 
	 *  Tests to see if the Suite is changed. 
	 */
	@Test
	public void testSetSuite() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getSuite(), Suites.Spades);
		test.setSuite(Suites.Hearts);
		assertEquals(test.getSuite(), Suites.Hearts);

	}

	/**
	 *  Runs the setSpecial(Specials newSpecial) 
	 *  Tests to see if the Special is changed. 
	 */
	@Test
	public void testSetSpecial() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getSpecial(), Specials.Bomb);
		test.setSpecial(Specials.None);
		assertEquals(test.getSpecial(), Specials.None);

	}

	/**
	 *  Runs the setVisibility(boolean setVisibility) 
	 *  Tests to see if the Visibility is changed. 
	 */
	@Test
	public void testSetVisibility() { 
		test = new Card(Ranks.Two, Suites.Spades, Specials.Bomb);
		assertEquals(test.getVisibility(), true);
		test.setVisibility(false);
		assertEquals(test.getVisibility(), false);

	}
}
