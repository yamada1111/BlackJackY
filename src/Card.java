
public class Card {
	String[] suit;
	int[] number;
	String rank;
	boolean faceUp;

public String[] getsuit() {
	return this.suit;
}
public int[] getnumber() {
	return this.number;
}
public void  cardCheck(boolean faceUp) {
		if(faceUp) {
			System.out.println(suit + "| " + rank);
		} else {
			System.out.println("??????" + "| ??");
		}
	}

}
