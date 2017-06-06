package game;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Player winner = null;
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("P1"));
		players.add(new Player("P2"));
		
//		Define que algoritmo de puxar carta será no jogo
		
//		Puxar duas de cima
		Rule rule = new Rule1();
//		Puxar duas de baixo
//		Rule rule = new Rule2();

		Game g = new Game(players, rule);
		
		g.startGame();
		
		while(winner==null){
			
		}
	}

}
