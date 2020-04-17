package BlackJackY;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> cards;

	Hand(){
		cards = new ArrayList<Card>();
	}
	void add(Card card) {
		cards.add(card);
	}
	int computeScore() {
		int sum = 0;
		for(Card i:cards) {
			if(i.num > 10)	sum +=10;
			else			sum +=i.num;
		}
		if(containsAce() && sum <=11) sum +=10;
		return sum;
	}
	private boolean containsAce() {
		for(Card i:cards) {
			if(i.num ==1)return true;
		}
		return false;

	}
	void faceUpAll() {
		for(Card i:cards) {
			i.FaceUp = true;
		}
	}
	@Override
	public String toString() {
		String str ="";
		for(Card i:cards) {
			str += i.toString();
		}
		return str;

	}
}
