
public class Card {
	String[] suit;
	int[] number;
	String rank;
	boolean faceUp;


public void  cardCheck(boolean faceUp) {
		if(faceUp) {
			System.out.println(suit + "| " + rank);
		} else {
			System.out.println("??????" + "| ??");
		}
	}

}
