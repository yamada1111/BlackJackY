package BlackJackY;

public class Card {
	String s;
	int num;
	boolean FaceUp;
	Card(String s,int num){
		this.s = s;
		this.num = num;
	}
	static String[] suit = {"diamond", "club", "heart", "spade"};
	void show(){
		System.out.println(s+"  "+num);
	}
	@Override
	public String toString() {
		String str="";
		str = "["+s+"|"+num+"]";
		return str;
	}
	void faceUp(boolean a) {

	}

}
