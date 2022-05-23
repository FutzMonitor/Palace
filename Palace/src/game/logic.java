package game;
/**
 * The logic component for the game Palace
 * Handles logical operations.
 * @author Christian Gonzalez
 * @date 05/20/2022
 * @last_modified 05/20/2022
 */
public class logic {

	// Indices? 
	public boolean numLogic(emptyDeck thisCard, emptyDeck needsToBeat, int index) {
		int cardOneVal = thisCard.getCard(thisCard, index).getRank().getRankVal();
		int cardTwoVal = needsToBeat.getCard(needsToBeat, 0).getRank().getRankVal();

		if(cardOneVal >= cardTwoVal) {
			return true;
		}
		else if(cardOneVal == 2 || cardOneVal == 4 || cardOneVal == 7 || cardOneVal == 10) {
			return true;
		}
		else {
			return false;
		}
	}
}
