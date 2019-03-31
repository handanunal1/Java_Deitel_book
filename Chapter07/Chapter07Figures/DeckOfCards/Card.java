
public class Card {

	private final String face; // face of card "Ace","Deuce"..
	private final String suit; // suit of card "Heart","Diamonds"..

	public Card(String cardFace, String cardSuit) {
		super();
		this.face = cardFace;
		this.suit = cardSuit;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return face + " of "+suit;
	}

}
