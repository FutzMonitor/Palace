package game;

import java.util.Random;

/**
 * Class that creates a CPU opponent for the game Palace.
 * This is a sub-class of the player.java class.
 * @author Christian Gonzalez
 * @date 05/20/2022
 * @last_modified 05/25/2022
 */
public class CPU extends Player {

	/**
	 * Constructs a new CPU object.
	 * @param initName - name of this CPU.
	 * @param initTurnId - the turn ID for this CPU opponent.
	 */
	public CPU(String initName, int initTurnId) {
		super(initName, initTurnId);
	}


	public void placeTableCards(Player thisPlayer, Deck fromThisDeck) {
		int min = 0;
		int max = 6;
		for(int i = 1; i < 4; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt((max - min) + 1) + min;
			thisPlayer.getPlayerHand(thisPlayer).moveCardWithLocation(thisPlayer.getPlayerHand(thisPlayer), thisPlayer.getPlayerTableHand(thisPlayer), randomNum);
			max = max - i;
		}
	}
}


