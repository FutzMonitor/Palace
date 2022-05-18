package game;
// Defines predefined constants for the magic cards.
// Bomb - Connected to any card with rank 2. Clears the deck and player gets another turn. 
// Window - Connected to any card with rank 4. Opposing player must match or beat the card below it.
// Humility - Connected to any card with rank 7. Opposing player must match or place a card lower than 7.
// Reset - Connected to any card with rank 10. Player can reset pile to any rank. 
// None - Connected to any card with any rank not 2, 4, 7, or 10. No special power.
public enum Special {
	Bomb, 
	Window, 
	Humility, 
	Reset, 
	None
}
