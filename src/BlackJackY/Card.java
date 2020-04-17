package BlackJackY;

public class Card {
	static String[] SUIT = {"diamond", "club", "heart", "spade"};
	String Suit;
	int No;
	boolean FaceUp;

public String getsuit() {
	return this.Suit;
}
public int getNo() {
	return this.No;
}

public boolean isFaceUp() {
	return FaceUp;
}

public void setFaceUp(boolean faceUp) {
	 this.FaceUp = faceUp;
}

public String Rank() {
	String str = "";
	if(No == 1) {
		str = "A";
	} else if(No == 11) {
		str = "J";
	} else if(No == 12) {
		str = "Q";
	} else if(No == 13) {
		str = "K";
	} else {
		str = Integer.toString(No);
	}
	return str;
}

public Card(String suit, int no) {
		this.No = no;
		this.Suit = suit;
}
@Override
public String toString() {
	String suit = "";
	String rank = "";
	if(FaceUp) {
		 suit = Suit.toString();
		 rank = Rank();
		return "["+suit + "|" + rank+"]";
	} else {
		 suit = "???????";
		 rank = "??";
		return "["+suit + "|" + rank+"]";
	}
}

}
