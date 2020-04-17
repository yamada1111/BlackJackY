package BlackJackY;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Deck {
	Deque<Card> cards = new ArrayDeque<Card>();

	Deck(){
		List<Card> newcards = createCards();
		List<Card> shaffled = shaffle(newcards);
		cards	= new ArrayDeque<Card>(shaffled);
	}
	Card pop(){
		return cards.pop();

	}
	private List<Card> createCards() {
		List<Card> list = new ArrayList<Card>();

		for(String s:Card.suit) {
			for(int i=0;i<13;i++) {
				list.add(new Card(s,i));
			}
		}
		return list;
	}
	private List<Card> shaffle(List<Card> cards) {
		Collections.shuffle(cards);
		return cards;
	}
}
