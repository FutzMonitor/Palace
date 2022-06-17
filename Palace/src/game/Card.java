package game;

/**
 * Class that creates cards for a game of Palace
 * @author Christian Gonzalez
 * @date 05/17/2022
 * @last_modified 05/25/2022
 */
public class Card {

	private Ranks cardRank;
	private Suites cardSuite;
	private Specials cardSpecial;
	private boolean visibility;

	public Card(Ranks initRank, Suites initSuite, Specials initcardSpecial) {
		cardRank = initRank;
		cardSuite = initSuite;
		cardSpecial = initcardSpecial;
		visibility = true;
	}

	/**
	 * Set a new rank to a card.
	 * @param newRank - new rank to be assigned
	 * @return
	 */
	public void setRank(Ranks newRank) {
		cardRank = newRank;
	}

	/**
	 * Set a new suite to a card.
	 * @param newSuite - new suite to be assigned.
	 * @return 
	 * @return
	 */
	public void setSuite(Suites newSuite) {
		cardSuite = newSuite;
	}

	/**
	 * Set a new special to a card.
	 * @param newSpecial - new special to be assigned.
	 */
	public void setSepcial(Specials newSpecial) {
		cardSpecial = newSpecial;
	}

	/**
	 * Sets visibility status of a card.
	 */
	public void setVisibility(boolean setVisibility) {
		visibility = setVisibility;
	}

	/**
	 * Return the rank of the card.
	 * @return - returns the rank of a card object.
	 */
	public Ranks getRank() {
		return cardRank;
	}

	/**
	 * Return the suite of the card.
	 * @return - returns the suite of a card object.
	 */
	public Suites getSuite() {
		return cardSuite;
	}

	/**
	 * Return the special of the card.
	 * @return - returns the special of a card object. 
	 */
	public Specials getSpecial() {
		return cardSpecial;
	}

	/**
	 * Returns the visibility status of the card. 
	 * @return - returns boolean value indicating whether a card
	 * ...is faced up or faced down.
	 */
	public boolean getVisibility() {
		return visibility;
	}

	/**
	 * Print the information of a card. 
	 * For debugging purposes.
	 * @param infoCard - The card we want info on.
	 * @return - Information on that card's Rank, Suite, and Special.
	 */
	public String toString(Card infoCard) {
		String cardInfo = "Rank: " + infoCard.getRank() + ", Value: " + infoCard.getRank().getRankVal() + ", Suite: " 
				+ infoCard.getSuite() + ", Special: " + infoCard.getSpecial() + ", Visibility: " + infoCard.getVisibility();
		return cardInfo;
	}
		// For debugging purposes
	//	public static void main(String[] args) {
	//		cards testCard = new cards(Ranks.Two, Suites.Spades, Specials.Bomb);
	//		System.out.println("Card's rank: " + testCard.getRank() + " , value of " + Ranks.Two.getRankVal()
	//		+ "\nCard's suite: " + testCard.getSuite() + 
	//		"\nCard's Special: " + testCard.getSpecial());
	//	}
} 