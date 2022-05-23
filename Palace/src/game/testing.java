package game;

import java.util.Random;

/**
 * Temporary class to test quick snippets of code.
 * @author Christian Gonzalez
 * @date 05/23/2022
 * @last_modified 05/23/2022
 */
public class testing {

	
	public static void main(String[] args) {
		int min = 0;
		int max = 6;
		for(int i = 1; i < 3; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt((max - min) + 1) + min;
			System.out.println(randomNum);
			max = max - i;
		}

	}
	
}
