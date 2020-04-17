package BlackJackY;

public class Program {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Deck deck = new Deck();
		Player player = new Player(new Hand(), deck, "Player");
		Player dealer = new Player(new Hand(), deck, "Dealer");
		Game game = new Game(player, dealer);
		game.Run();
	}

}
