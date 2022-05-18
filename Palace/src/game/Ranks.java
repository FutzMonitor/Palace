package game;
// Different card ranks along with their numeric values
public enum Ranks {
	Ace(1),
	Two(2), 
	Three(3),
	Four(4), 
	Five(5),
	Six(6), 
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13);


	private int rankVal;

	/**
	 * Assigns each rank their numeric values.
	 * @param numVal - numeric value of that rank.
	 */
    Ranks(int numVal) {
        this.rankVal = numVal;
    }

    /**
     * Returns the numeric value of a card's rank.
     * @return - return numeric value of card's rank.
     */
    public int getRankVal() {
        return rankVal;
    } 
}