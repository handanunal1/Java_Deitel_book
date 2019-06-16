package chapter16.figures.f10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Figures 16.10 Sort3
 * 
 * Author: Handan Unal
 * 
 */
class Cards {

	public static enum Face {
		Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};

	public static enum Suit {
		Hearts, Diamonds, Spades, Clubs
	};

	private final Face face;
	private final Suit suit;

	public Cards(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	public Face getFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}

	public String toString() {
		return String.format("%s of %s", face, suit);
	}

}

public class DeckOfCards {
	private List<Cards> list;

	public DeckOfCards() {
		Cards[] deck = new Cards[52];
		int count = 0; // number of cards

		for (Cards.Suit suit : Cards.Suit.values()) {

			for (Cards.Face face : Cards.Face.values()) {
				deck[count] = new Cards(face, suit);
				++count;
			}
		}

		list = Arrays.asList(deck); //
		Collections.shuffle(list);

	}

	public void printCards() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
		}
	}
	
	
	public static void main(String[] args)
	{
		DeckOfCards card = new DeckOfCards();
		card.printCards();
	}
}
