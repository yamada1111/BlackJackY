package BlackJackY;

public class Player {
	String name;
	Hand hand;
	Deck deck;

	Player(Hand hand,Deck deck,String name){
		this.hand = hand;
		this.deck = deck;
		this.name = name;
		}
	String getName() {
		return this.name;
	}
	int getScore() {
		return hand.computeScore();
	}
	boolean isBust(){
		if(getScore()>21)return true;
		return false;
	}
	void take() {
		Card card = deck.pop();
		card.faceUp(true);
		showTookCard(card);
		hand.add(card);
	}
	void take(boolean b) {
		Card card = deck.pop();
		card.faceUp(b);
		showTookCard(card);
		hand.add(card);
	}
	private void showTookCard(Card card){
		System.out.println("["+name+"] => "+card.toString());
	}
	void showHand(){
		hand.faceUpAll();
		System.out.println("["+name+"] => Hand:"+hand.toString());
		System.out.println("["+name+"] => Score:"+this.getScore());
	}
}
