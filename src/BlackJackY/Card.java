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
	while(true) {
		System.out.println("エラーです");
		this.No = no;
		this.Suit = suit;
		if(no > 1 || 13 > no) {
			break;
		}
	}
}
@Override
public String toString() {
	String suit = "";
	String rank = "";
	if(FaceUp) {
		 suit = Suit.toString();
		 rank = Rank();
		System.out.println(suit + "|" + rank);
	} else {
		 suit = "???????";
		 rank = "??";
		System.out.println(suit + "|" + rank);
	}
	return suit + rank;
}

}
