package BlackJackY;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	List<Card> cards;

	Hand(){
		cards = new ArrayList<Card>();
	}
	void Add(Card card) {
		cards.add(card);
	}
	int ComputeScore() {
		int sum = 0;
		for(Card i:cards) {
			if(i.num > 10)	sum +=10;
			else			sum +=i.num;
		}
		if(ContainsAce() && sum <=11) sum +=10;
		return sum;
	}
	private boolean ContainsAce() {
		for(Card i:cards) {
			if(i.num ==1)return true;
		}
		return false;

	}
	void FaceUpAll() {
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
