package BlackJackY;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);

	Player p;
	Player d;
	Game(Player player, Player dealer){
		p = player;
		d = dealer;
	}
	public void Run() {

		//準備フェーズ
		System.out.println("<< Welcome to Blackjack!! >>");

		p.take();
		p.take();
		p.showHand();
		System.out.println("");

		d.take();
		d.take(false);
		System.out.println("");

		//プレイヤーの番
		System.out.println("<< "+p.getName()+" turn! >>");
		while(this.hitOrStand()) {
			p.take();
			p.showHand();
			if(p.isBust()) {
				System.out.println(p.getName()+" have over 21, "+p.getName()+ "bust!");
				System.out.println("");
				this.lost();
			}
		}
		System.out.println("");

		//ディーラーの番
		System.out.println("<< "+d.getName()+" turn! >>");
		while(d.getScore()<17) {
			d.take();
		}
		d.showHand();
		if(d.isBust()) {
			System.out.println(d.getName()+" have over 21, "+d.getName()+ "bust!");
			System.out.println("");
			this.won();
		}
		System.out.println("");

		System.out.println("<< Result >>");
		p.showHand();
		d.showHand();
		if(p.getScore()>d.getScore()) {
			this.won();
		}else if(d.getScore()>p.getScore()) {
			this.lost();
		}else {
			this.drawn();
		}
	}

	private boolean hitOrStand(){
		System.out.println("Hit or Stand? [h/s]");
		while(true) {
			String s = scan.nextLine();
			if(s.equals("h")) {
				return true;
			}
			if(s.equals("s")) {
				return false;
			}else {
				System.out.println("Invalid key. Please input h or s.");
			}
		}
	}
	private void won() {
		System.out.println(p.getName()+" won. Congrats!");
		this.end();
	}
	private void lost() {
		System.out.println(p.getName()+" lost.");
		this.end();
	}
	private void drawn() {
		System.out.println("This game is drawn...");
		this.end();
	}
	private void end() {
		System.out.println("To close, press return key.");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s);
		scan.close();
		System.exit(0);
	}
}
